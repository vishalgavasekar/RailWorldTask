package STUDENT_INFO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAO studentOps = new StudentDAO();
        CourseDAO courseOps = new CourseDAO();
        GradeDAO gradeOps = new GradeDAO();
        EnrollmentDAO enrollmentOps = new EnrollmentDAO();

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Student Operations");
            System.out.println("2. Course Operations");
            System.out.println("3. Grade Operations");
            System.out.println("4. Enrollment Operations");
            System.out.println("0. Exit");
            int choice = getInputAsInt(scanner);

            switch (choice) {
                case 1:
                    studentMenu(scanner, studentOps);
                    break;
                case 2:
                    courseMenu(scanner, courseOps);
                    break;
                case 3:
                    gradeMenu(scanner, gradeOps);
                    break;
                case 4:
                    enrollmentMenu(scanner, enrollmentOps);
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void studentMenu(Scanner scanner, StudentDAO studentOps) {
        while (true) {
            System.out.println("Student Operations:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View All Students");
            System.out.println("5. Back to Main Menu");
            int choice = getInputAsInt(scanner);

            switch (choice) {
                case 1:
                    studentOps.addStudent(scanner);
                    break;
                case 2:
                    studentOps.updateStudent(scanner);
                    break;
                case 3:
                    studentOps.deleteStudent(scanner);
                    break;
                case 4:
                    studentOps.viewAllStudents();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void courseMenu(Scanner scanner, CourseDAO courseOps) {
        while (true) {
            System.out.println("Course Operations:");
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Delete Course");
            System.out.println("4. View All Courses");
            System.out.println("5. Back to Main Menu");
            int choice = getInputAsInt(scanner);

            switch (choice) {
                case 1:
                    courseOps.addCourse(scanner);
                    break;
                case 2:
                    courseOps.updateCourse(scanner);
                    break;
                case 3:
                    courseOps.deleteCourse(scanner);
                    break;
                case 4:
                    courseOps.viewAllCourses();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void gradeMenu(Scanner scanner, GradeDAO gradeOps) {
        while (true) {
            System.out.println("Grade Operations:");
            System.out.println("1. Add Grade");
            System.out.println("2. Update Grade");
            System.out.println("3. Delete Grade");
            System.out.println("4. View All Grades");
            System.out.println("5. Back to Main Menu");
            int choice = getInputAsInt(scanner);

            switch (choice) {
                case 1:
                    gradeOps.addGrade(scanner);
                    break;
                case 2:
                    gradeOps.updateGrade(scanner);
                    break;
                case 3:
                    gradeOps.deleteGrade(scanner);
                    break;
                case 4:
                    gradeOps.viewAllGrades();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void enrollmentMenu(Scanner scanner, EnrollmentDAO enrollmentOps) {
        while (true) {
            System.out.println("Enrollment Operations:");
            System.out.println("1. Add Enrollment");
            System.out.println("2. Update Enrollment");
            System.out.println("3. Delete Enrollment");
            System.out.println("4. View All Enrollments");
            System.out.println("5. Back to Main Menu");
            int choice = getInputAsInt(scanner);

            switch (choice) {
                case 1:
                    enrollmentOps.addEnrollment(scanner);
                    break;
                case 2:
                    enrollmentOps.updateEnrollment(scanner);
                    break;
                case 3:
                    enrollmentOps.deleteEnrollment(scanner);
                    break;
                case 4:
                    enrollmentOps.viewAllEnrollments();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getInputAsInt(Scanner scanner) {
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            System.out.println("Input cannot be empty. Please enter a valid choice:");
            input = scanner.nextLine();
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number:");
            return getInputAsInt(scanner);
        }
    }
}
