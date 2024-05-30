package STUDENT_INFO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {
    private Connection connection; // holds the db connection obj

    public StudentDAO() {  // constructor to initialize the connection obj using below method
        connection = DatabaseConnection.getConnection();
    }

    public void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        try {
            String sql = "INSERT INTO Students (name, age, email) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Scanner scanner) {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new student email: ");
        String email = scanner.nextLine();

        try {
            String sql = "UPDATE Students SET name = ?, age = ?, email = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, email);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
            System.out.println("Student updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();

        try {
            String sql = "DELETE FROM Students WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Student deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewAllStudents() {
        List<Student> students = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Students";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String email = resultSet.getString("email");
                Student student = new Student(id, name, age, email);
                students.add(student);
            }

            if (students.isEmpty()) {
                System.out.println("No students found.");
            } else {
                for (Student student : students) {
                    System.out.println(student);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


