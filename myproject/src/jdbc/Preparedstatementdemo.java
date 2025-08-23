package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparedstatementdemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/SchoolDB";
        String user = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection created");

        String query = "INSERT INTO student1(rollno, name, age) VALUES (?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);

        // First student
        pst.setInt(1, 101);
        pst.setString(2, "Lakshman");
        pst.setInt(3, 20);
        pst.addBatch();

        // Second student
        pst.setInt(1, 102);
        pst.setString(2, "Prudhvi");
        pst.setInt(3, 20);
        pst.addBatch();

        // Third student
        pst.setInt(1, 103);
        pst.setString(2, "Suvin");
        pst.setInt(3, 20);
        pst.addBatch();

        // Execute all in batch
        int[] rows = pst.executeBatch();
        System.out.println(rows.length + " rows inserted.");

        pst.close();
        con.close();
    }
}
