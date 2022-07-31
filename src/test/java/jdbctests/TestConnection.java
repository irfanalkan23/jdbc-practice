package jdbctests;

import java.sql.*;

public class TestConnection {

    public static void main(String[] args) throws SQLException {

//        String dbUrl = "jdbc:oracle:thin:@YOURIPHERE4:1521:XE";
        String dbUrl = "jdbc:oracle:thin:@44.202.93.236:1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";

        Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM regions");

        // ResultSet points to "row 0" by default
        // next() --> move pointer to the first row!
//        resultSet.next();
//
//        // getting information with column name
//        System.out.println(resultSet.getString("region_name"));
//        // getting information with column index (starts from 1)
//        System.out.println(resultSet.getString(2));
//
//        // 1 - Europe
//        // 2 - Americas
//        System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
//
//        // move to second row
//        resultSet.next();
//        System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
//        // move to third row
//        resultSet.next();
//        System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
        }

        // --> next() returns boolean: true if the new current row is valid, false if there are no more rows

        //close connection
        resultSet.close();
        statement.close();
        connection.close();

    }
}
