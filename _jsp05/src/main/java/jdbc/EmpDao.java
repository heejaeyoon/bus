package jdbc;

import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmpDao {
   private Connection conn = getConnect();

   private static EmpDao empDao = new EmpDao();

   public static EmpDao getInstance() {
      return empDao;
   }

   private EmpDao() {
   }

   private Connection getConnect() {
      try {
         Properties prop = new Properties();
         String path = EmpDao.class.getResource("db.properties").getPath();
         path = URLDecoder.decode(path, "utf-8");
         prop.load(new FileReader(path));
         String driver = prop.getProperty("driver");
         String url = prop.getProperty("url");
         String user = prop.getProperty("user");
         String pw = prop.getProperty("pw");

         Class.forName(driver);
//         String url = "jdbc:oracle:thin:@localhost:1521:xe";
//         String user = "scott", pw = "tiger";
         Connection conn = DriverManager.getConnection(url, user, pw);
         return conn;
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return null;

   }

   public Emp select(int num) {
      String sql = "select * from emp where empno = ?";
      Emp emp = null;
      try {
         PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.setInt(1, num);
         ResultSet rs = pstm.executeQuery();
         if (rs.next()) {
            int empno = rs.getInt("empno");
            String ename = rs.getString("ename");
            String job = rs.getString("job");
            int deptno = rs.getInt("deptno");
            int sal = rs.getInt("sal");
            String hiredate = rs.getString("hiredate");
            int mgr = rs.getInt("mgr");
            int comm = rs.getInt("comm");
//            System.out.printf("%d %s %s %d %d\n", empno, ename, job, deptno, sal);
            emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);

         }
         rs.close();
         pstm.close();
         return emp;

//         return 
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      return null;

   }
   
   
   
   
   public List<Emp> selDeptSvg() {
      List<Emp> lst = new ArrayList<>();

      String sql = "select deptno, job, avg(sal) as avg_sal "
            + "from emp "
            + "group by deptno, job "
            + "order by deptno, job";
      
      try {
         PreparedStatement pstm = conn.prepareStatement(sql);
         ResultSet rs = pstm.executeQuery();
         while (rs.next()) {
            int empno = 0;
            String ename = null;
            String job = rs.getString("job");
            int deptno = rs.getInt("deptno");
            int sal = rs.getInt("avg_sal");
            String hiredate = null;
            int mgr = 0;
            int comm = 0;
//            System.out.printf("%d %s %s %d %d\n", empno, ename, job, deptno, sal);
            Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
            lst.add(emp);
         }
         rs.close();
         pstm.close();
         return lst;

//         return 
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      return null;

   }
   

   
   public List<Emp> selectAll(int num) {

      List<Emp> lst = new ArrayList<>();

      String sql = null;
      switch (num) {
      case 0: // ?????? ??????
         sql = "select * from emp";
         break;
      case 1: // ????????? ????????????
         sql = "select * from emp order by deptno";
         break;
      case 2: // ????????? ????????????
         sql = "select * from emp order by deptno desc";
         break;
      }
      try {
         PreparedStatement pstm = conn.prepareStatement(sql);
         ResultSet rs = pstm.executeQuery();
         while (rs.next()) {
            int empno = rs.getInt("empno");
            String ename = rs.getString("ename");
            String job = rs.getString("job");
            int deptno = rs.getInt("deptno");
            int sal = rs.getInt("sal");
            String hiredate = rs.getString("hiredate");
            int mgr = rs.getInt("mgr");
            int comm = rs.getInt("comm");
//            System.out.printf("%d %s %s %d %d\n", empno, ename, job, deptno, sal);
            Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
            lst.add(emp);
         }
         rs.close();
         pstm.close();
         return lst;

//         return 
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      return null;

   }

   
   
   public static void main(String[] args) {
      EmpDao ed = EmpDao.getInstance();
//      for (Emp emp : ed.selectAll(0)) {
//         System.out.println(emp);
//      }
      List<Emp> lst = ed.selectAll(0);
//      lst.stream().forEach(n -> System.out.println(n));
      
      double avg = lst.stream().filter(n->n.getDeptno()==20).mapToInt(Emp::getSal).average().getAsDouble();
      System.out.println(avg);
      
      lst.stream().filter(n->n.getDeptno()==10).forEach(x->System.out.println(x));
   }
   
   
}