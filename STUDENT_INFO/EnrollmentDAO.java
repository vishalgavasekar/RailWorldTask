package STUDENT_INFO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnrollmentDAO {
    private Connection connection;

    public EnrollmentDAO() {
        connection = DatabaseConnection.getConnection();
    }

    public void addEnrollment(Scanner scanner) {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        System.out.print("Enter course ID: ");
        int courseId = scanner.nextInt();
        System.out.print("Enter enrollment date (YYYY-MM-DD): ");
        String enrollmentDateStr = scanner.next();
        Date enrollmentDate = Date.valueOf(enrollmentDateStr);

        try {
            String sql = "INSERT INTO Enrollments (student_id, course_id, enrollment_date) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, courseId);
            preparedStatement.setDate(3, enrollmentDate);
            preparedStatement.executeUpdate();
            System.out.println("Enrollment added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEnrollment(Scanner scanner) {
        System.out.print("Enter enrollment ID to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter new enrollment date (YYYY-MM-DD): ");
        String enrollmentDateStr = scanner.next();
        Date enrollmentDate = Date.valueOf(enrollmentDateStr);

        try {
            String sql = "UPDATE Enrollments SET enrollment_date = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, enrollmentDate);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            System.out.println("Enrollment updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEnrollment(Scanner scanner) {
        System.out.print("Enter enrollment ID to delete: ");
        int id = scanner.nextInt();

        try {
            String sql = "DELETE FROM Enrollments WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Enrollment deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewAllEnrollments() {
        List<Enrollment> enrollments = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Enrollments";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int studentId = resultSet.getInt("student_id");
                int courseId = resultSet.getInt("course_id");
                Date enrollmentDate = resultSet.getDate("enrollment_date");
                Enrollment enrollment = new Enrollment(id, studentId, courseId, enrollmentDate);
                enrollments.add(enrollment);
            }

            if (enrollments.isEmpty()) {
                System.out.println("No enrollments found.");
            } else {
                for (Enrollment enrollment : enrollments) {
                    System.out.println(enrollment);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


