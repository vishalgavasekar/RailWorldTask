package ObjectCollab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter school name: ");
        String schoolName = sc.nextLine();
        System.out.print("Enter maximum number of students: ");
        int maxStudents = sc.nextInt();
        School school = new School(schoolName, maxStudents);

        sc.nextLine(); // Consume newline

        for (int i = 0; i < maxStudents; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();
            System.out.print("Enter student roll number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter number of subjects: ");
            int numSubjects = sc.nextInt();
            sc.nextLine(); // Consume newline

            Student student = new Student(studentName, rollNumber, numSubjects);
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Subject " + (j + 1));
                System.out.print("Enter subject name: ");
                String subjectName = sc.nextLine();
                System.out.print("Enter subject code: ");
                int subjectCode = sc.nextInt();
                sc.nextLine(); // Consume newline

                student.addSubject(new Subject(subjectName, subjectCode));
            }
            school.addStudent(student);
        }

        sc.close();

        System.out.println(school);
    }
}