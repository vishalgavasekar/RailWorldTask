package STUDENT_INFO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeDAO {
    private Connection connection;

    public GradeDAO() {
        connection = DatabaseConnection.getConnection();
    }

    public void addGrade(Scanner scanner) {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        System.out.print("Enter course ID: ");
        int courseId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        try {
            String sql = "INSERT INTO Grades (student_id, course_id, grade) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, courseId);
            preparedStatement.setString(3, grade);
            preparedStatement.executeUpdate();
            System.out.println("Grade added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateGrade(Scanner scanner) {
        System.out.print("Enter grade ID to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter new grade: ");
        String grade = scanner.next();

        try {
            String sql = "UPDATE Grades SET grade = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, grade);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            System.out.println("Grade updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteGrade(Scanner scanner) {
        System.out.print("Enter grade ID to delete: ");
        int id = scanner.nextInt();

        try {
            String sql = "DELETE FROM Grades WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Grade deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewAllGrades() {
        List<Grade> grades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Grades";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int studentId = resultSet.getInt("student_id");
                int courseId = resultSet.getInt("course_id");
                String grade = resultSet.getString("grade");
                Grade gradeObj = new Grade(id, studentId, courseId, grade);
                grades.add(gradeObj);
            }

            if (grades.isEmpty()) {
                System.out.println("No grades found.");
            } else {
                for (Grade grade : grades) {
                    System.out.println(grade);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


