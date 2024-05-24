package JDBC;
import java.sql.*;
public class Main1 {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String  username= "root";
    private static final String password = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        try (
            Connection connection = DriverManager.getConnection(url, username, password)){
            String query = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";


            //Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "Ankita");
            preparedStatement.setInt(2, 25);
            preparedStatement.setDouble(3, 84.78);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Inserted Successfully!");
            } else {
                //System.out.println("Data Not Inserted");
                System.out.println("Data Not Updated");

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }


    }

}
