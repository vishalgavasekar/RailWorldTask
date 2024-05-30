package STUDENT_INFO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class CourseDAO {
        private Connection connection;

        public CourseDAO() {
            connection = DatabaseConnection.getConnection();
        }

        public void addCourse(Scanner scanner) {
            System.out.print("Enter course name: ");
            String name = scanner.nextLine();
            System.out.print("Enter course description: ");
            String description = scanner.nextLine();

            try {
                String sql = "INSERT INTO Courses (name, description) VALUES (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, description);
                preparedStatement.executeUpdate();
                System.out.println("Course added successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void updateCourse(Scanner scanner) {
            System.out.print("Enter course ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter new course name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new course description: ");
            String description = scanner.nextLine();

            try {
                String sql = "UPDATE Courses SET name = ?, description = ? WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, description);
                preparedStatement.setInt(3, id);
                preparedStatement.executeUpdate();
                System.out.println("Course updated successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void deleteCourse(Scanner scanner) {
            System.out.print("Enter course ID to delete: ");
            int id = scanner.nextInt();

            try {
                String sql = "DELETE FROM Courses WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                System.out.println("Course deleted successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void viewAllCourses() {
            List<Course> courses = new ArrayList<>();
            try {
                String sql = "SELECT * FROM Courses";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String description = resultSet.getString("description");
                    Course course = new Course(id, name, description);
                    courses.add(course);
                }

                if (courses.isEmpty()) {
                    System.out.println("No courses found.");
                } else {
                    for (Course course : courses) {
                        System.out.println(course);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

