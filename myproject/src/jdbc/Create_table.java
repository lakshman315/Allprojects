package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_table {


	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		String url = "jdbc:mysql://localhost:3306/SchoolDB";
		String user = "root";
		String password = "root";

		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(url, user, password);
	            Statement stmt = con.createStatement();
	            System.out.println("Connected to database\n");

	            // 1. Create Table
	            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students(rollno INT PRIMARY KEY, name VARCHAR(50), per INT, email VARCHAR(50))");

	            // 2. Insert Records
	            stmt.executeUpdate("INSERT INTO students VALUES(101, 'Lakshman', 98, 'lakshman@gmail.com')," +
	                    "(102, 'Prudhvi', 89, 'prudhvi@gmail.com')," +
	                    "(103, 'Suvin', 79, 'suvin@gmail.com')");

	            // 3. Print Table
	            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
	            System.out.println("Table: students");
	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
	                        rs.getInt(3) + " " + rs.getString(4));
	            }

	            // 4. Update Table
	            stmt.executeUpdate("UPDATE students SET per = 95 WHERE rollno = 103");

	            // 5. Find Highest Percentage Students
	            rs = stmt.executeQuery("SELECT * FROM students WHERE per = (SELECT MAX(per) FROM students)");
	            System.out.println("\nHighest Percentage Students:");
	            while (rs.next()) {
	                System.out.println(rs.getString("name") + " - " + rs.getInt("per"));
	            }

	            // 6. Arrange Records in Ascending Order
	            rs = stmt.executeQuery("SELECT * FROM students ORDER BY per ASC");
	            System.out.println("\nRecords in Ascending Order (per):");
	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
	                        rs.getInt(3) + " " + rs.getString(4));
	            }

	            // 7. Add New Column
	            stmt.executeUpdate("ALTER TABLE students ADD city VARCHAR(30)");

	            // 8. Update city values
	            stmt.executeUpdate("UPDATE students SET city = 'Delhi' WHERE rollno = 101");
	            stmt.executeUpdate("UPDATE students SET city = 'Delhi' WHERE rollno = 102");
	            stmt.executeUpdate("UPDATE students SET city = 'Mumbai' WHERE rollno = 103");

	            // 9. Find All Students from Same City
	            rs = stmt.executeQuery("SELECT * FROM students WHERE city = 'Delhi'");
	            System.out.println("\nStudents from Delhi:");
	            while (rs.next()) {
	                System.out.println(rs.getString("name") + " - " + rs.getString("city"));
	            }

	            // 10. Modify Column Datatype
	            stmt.executeUpdate("ALTER TABLE students MODIFY city VARCHAR(50)");

	            // 11. Change Table Name
	            stmt.executeUpdate("RENAME TABLE students TO new_students");

	            // 12. Delete Column
	            stmt.executeUpdate("ALTER TABLE new_students DROP COLUMN email");

	            // 13. Delete Single Row
	            stmt.executeUpdate("DELETE FROM new_students WHERE rollno = 103");

	            // 14. Delete All Records (keep table structure)
	            stmt.executeUpdate("DELETE FROM new_students");

	            // 15. Delete Entire Table
	            stmt.executeUpdate("DROP TABLE IF EXISTS new_students");

	            // Create second table for joins
	            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS institute(rollno INT PRIMARY KEY, course VARCHAR(30))");
	            stmt.executeUpdate("INSERT IGNORE INTO institute VALUES(101, 'BCA'), (102, 'MCA'), (104, 'MBA')");

	            // Re-create student table for joins
	            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student(rollno INT PRIMARY KEY, name VARCHAR(30))");
	            stmt.executeUpdate("INSERT IGNORE INTO student VALUES(101, 'Neeva'), (102, 'Reeva'), (103, 'Shiva')");

	            System.out.println("\n--- JOINS ---");

	            // INNER JOIN - Common Records
	            rs = stmt.executeQuery("SELECT * FROM student INNER JOIN institute USING(rollno)");
	            System.out.println("\nInner Join (Common Records):");
	            while (rs.next()) {
	                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getString("course"));
	            }

	            // LEFT JOIN - All records from student
	            rs = stmt.executeQuery("SELECT * FROM student LEFT JOIN institute USING(rollno)");
	            System.out.println("\nLeft Join (All student records):");
	            while (rs.next()) {
	                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getString("course"));
	            }

	            // RIGHT JOIN - All records from institute
	            rs = stmt.executeQuery("SELECT * FROM student RIGHT JOIN institute USING(rollno)");
	            System.out.println("\nRight Join (All institute records):");
	            while (rs.next()) {
	                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getString("course"));
	            }

	            // FULL JOIN using UNION (MySQL doesn't support FULL OUTER JOIN directly)
	            rs = stmt.executeQuery(
	                "(SELECT * FROM student LEFT JOIN institute USING(rollno)) " +
	                "UNION " +
	                "(SELECT * FROM student RIGHT JOIN institute USING(rollno))"
	            );
	            System.out.println("\nFull Join (All records):");
	            while (rs.next()) {
	                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getString("course"));
	            }

	            // Close connections
	            stmt.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
