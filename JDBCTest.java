package Mohan;
import java.sql.*;

public class JDBCTest {
    //private static Object DriverManager;

	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "Mohan@1884"
            );

            String insertSQL = "REPLACE INTO students VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);
            
            Object[][] students = {
                {1, "mohan"},
                {2, "kl rahul"},
                {3, "kohli"},
                {4, "dhoni"},
                {5, "kane"}
            };

            for (Object[] student : students) {
                pstmt.setInt(1, (int) student[0]);
                pstmt.setString(2, (String) student[1]);
                pstmt.executeUpdate();
            }

            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "." + rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
