package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc_example {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolDB","root","root");
		System.out.println("connection created");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from Employees");
		System.out.println("EmpID \tEmpName \tDeptId");
		while(rs.next())
		{
			int EmpId=rs.getInt("EmpID");
			String EmpName=rs.getString("EmpName");
			int DeptId=rs.getInt("DeptId");
			System.out.println(EmpId+"\t"+EmpName+"\t"+DeptId );
		}
		rs.close();
		stmt.close();
		con.close();
		
	}

}
