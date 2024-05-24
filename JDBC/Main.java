package JDBC;
import java.sql.*;
public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String  username= "root";
    private static final String password = "root";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        try{
            Connection connection =DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //String query = "select * from students";
            //ResultSet resultset = statement.executeQuery(query);
            //String query  = String.format("INSERT INTO students(name,age,marks) VALUES('%s', %o, %f)", "Adesh", 23, 95.5);
            //String query  = String.format("UPDATE students SET marks = %f WHERE id = %d", 94.20, 1);
            String query  = "DELETE FROM students WHERE ID = 2";
            int rowsAffected = statement.executeUpdate(query);

            if(rowsAffected>0){
                //System.out.println("Data Inserted Successfullt!");
                //System.out.println("Data Updated Successfullt!");
                System.out.println("Data Deleted Successfullt!");


            }else{
                //System.out.println("Data Not Inserted");
                System.out.println("Data Not Updated");

            }



//            while(resultset.next()){
//                int id = resultset.getInt("id");
//                String name = resultset.getString("name");
//                int age = resultset.getInt("age");
//                double marks = resultset.getDouble("marks");
//                System.out.println("ID : "+ id);
//                System.out.println("NAME : "+ name);
//                System.out.println("AGE : "+ age);
//                System.out.println("MARKS : "+ marks);
//            }



        }catch(SQLException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

    }

}
