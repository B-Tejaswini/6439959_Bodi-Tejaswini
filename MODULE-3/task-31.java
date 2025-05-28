import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSQLiteExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";  
        try {
            
            Class.forName("org.sqlite.JDBC");

            
            Connection conn = DriverManager.getConnection(url);

            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

           
            System.out.println("ID | Name    | Age");
            System.out.println("-------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.printf("%d  | %-7s | %d%n", id, name, age);
            }

            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}