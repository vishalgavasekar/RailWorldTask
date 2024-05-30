# Student Information Management System

Sure, here's a detailed explanation of the functionality provided by your Student Information Management System project:

## Functionality

### 1. **Student Operations**

#### a. Add Student
- Prompts the user to enter the student's name, age, and email.
- Inserts the provided information into the `Students` table in the database.
- Displays a message confirming the addition of the student.

#### b. Update Student
- Prompts the user to enter the student's ID whose details are to be updated.
- Asks for the new name, age, and email for the student.
- Updates the student's information in the `Students` table based on the provided ID.
- Displays a message confirming the update.

#### c. Delete Student
- Prompts the user to enter the student's ID to be deleted.
- Removes the student record from the `Students` table based on the provided ID.
- Displays a message confirming the deletion.

#### d. View All Students
- Retrieves all student records from the `Students` table.
- Displays each student's ID, name, age, and email.

### 2. **Course Operations**

#### a. Add Course
- Prompts the user to enter the course name and description.
- Inserts the provided information into the `Courses` table in the database.
- Displays a message confirming the addition of the course.

#### b. Update Course
- Prompts the user to enter the course ID whose details are to be updated.
- Asks for the new name and description for the course.
- Updates the course's information in the `Courses` table based on the provided ID.
- Displays a message confirming the update.

#### c. Delete Course
- Prompts the user to enter the course ID to be deleted.
- Removes the course record from the `Courses` table based on the provided ID.
- Displays a message confirming the deletion.

#### d. View All Courses
- Retrieves all course records from the `Courses` table.
- Displays each course's ID, name, and description.

### 3. **Grade Operations**

#### a. Add Grade
- Prompts the user to enter the student ID, course ID, and grade.
- Inserts the provided information into the `Grades` table in the database.
- Displays a message confirming the addition of the grade.

#### b. Update Grade
- Prompts the user to enter the grade ID whose details are to be updated.
- Asks for the new student ID, course ID, and grade.
- Updates the grade's information in the `Grades` table based on the provided ID.
- Displays a message confirming the update.

#### c. Delete Grade
- Prompts the user to enter the grade ID to be deleted.
- Removes the grade record from the `Grades` table based on the provided ID.
- Displays a message confirming the deletion.

#### d. View All Grades
- Retrieves all grade records from the `Grades` table.
- Displays each grade's ID, student ID, course ID, and grade.

### 4. **Enrollment Operations**

#### a. Add Enrollment
- Prompts the user to enter the student ID, course ID, and enrollment date.
- Inserts the provided information into the `Enrollments` table in the database.
- Displays a message confirming the addition of the enrollment.

#### b. Update Enrollment
- Prompts the user to enter the enrollment ID whose details are to be updated.
- Asks for the new student ID, course ID, and enrollment date.
- Updates the enrollment's information in the `Enrollments` table based on the provided ID.
- Displays a message confirming the update.

#### c. Delete Enrollment
- Prompts the user to enter the enrollment ID to be deleted.
- Removes the enrollment record from the `Enrollments` table based on the provided ID.
- Displays a message confirming the deletion.

#### d. View All Enrollments
- Retrieves all enrollment records from the `Enrollments` table.
- Displays each enrollment's ID, student ID, course ID, and enrollment date.

### 5. **Main Menu Operations**

- Provides a main menu to navigate between different operations (Student, Course, Grade, Enrollment).
- Allows the user to exit the program.
- Handles invalid input by prompting the user to enter a valid choice.

This system provides a comprehensive set of operations for managing students, courses, grades, and enrollments 
in a relational database, making it a useful tool for educational institutions to maintain and manage their data.



DEVELOPMENT :->>> 

This project is a Student Information Management System developed using Java and JDBC. It provides functionalities to manage students, courses, grades, and enrollments in a relational database. The system uses a MySQL database to store and manage the data.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Classes and Methods](#classes-and-methods)

## Features

- Add, update, delete, and view students.
- Add, update, delete, and view courses.
- Add, update, delete, and view grades.
- Add, update, delete, and view enrollments.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL database
- MySQL Connector/J (JDBC Driver for MySQL)

## Setup Instructions

Set up the MySQL database:

Create a new database named StudentDB.

Create the necessary tables:

CREATE TABLE Students (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
age INT NOT NULL,
email VARCHAR(100) NOT NULL
);

CREATE TABLE Courses (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
description TEXT
);

CREATE TABLE Grades (
id INT AUTO_INCREMENT PRIMARY KEY,
student_id INT,
course_id INT,
grade CHAR(2),
FOREIGN KEY (student_id) REFERENCES Students(id),
FOREIGN KEY (course_id) REFERENCES Courses(id)
);

CREATE TABLE Enrollments (
id INT AUTO_INCREMENT PRIMARY KEY,
student_id INT,
course_id INT,
enrollment_date DATE,
FOREIGN KEY (student_id) REFERENCES Students(id),
FOREIGN KEY (course_id) REFERENCES Courses(id)
);


Configure the database connection:

Update the database URL, username, and password in DatabaseConnection.java:

java
Copy code
private static final String URL = "jdbc:mysql://localhost:3306/StudentDB";
private static final String USER = "root";
private static final String PASSWORD = "root";


Project Structure
css
Copy code
student-info-system/
├── STUDENT_INFO/
│   ├── DatabaseConnection.java
│   ├── StudentDAO.java
│   ├── CourseDAO.java
│   ├── GradeDAO.java
│   ├── EnrollmentDAO.java
│   ├── Student.java
│   ├── Course.java
│   ├── Grade.java
│   ├── Enrollment.java
│   └── Main.java
└── README.md



Classes and Methods
DatabaseConnection
Manages the database connection using JDBC.
Contains a static initializer block to load the MySQL JDBC driver and establish the connection.
StudentDAO
addStudent(Scanner scanner): Adds a new student to the database.
updateStudent(Scanner scanner): Updates an existing student's details in the database.
deleteStudent(Scanner scanner): Deletes a student from the database.
viewAllStudents(): Retrieves and displays all students from the database.
CourseDAO
addCourse(Scanner scanner): Adds a new course to the database.
updateCourse(Scanner scanner): Updates an existing course's details in the database.
deleteCourse(Scanner scanner): Deletes a course from the database.
viewAllCourses(): Retrieves and displays all courses from the database.
GradeDAO
addGrade(Scanner scanner): Adds a new grade to the database.
updateGrade(Scanner scanner): Updates an existing grade in the database.
deleteGrade(Scanner scanner): Deletes a grade from the database.
viewAllGrades(): Retrieves and displays all grades from the database.
EnrollmentDAO
addEnrollment(Scanner scanner): Adds a new enrollment to the database.
updateEnrollment(Scanner scanner): Updates an existing enrollment's details in the database.
deleteEnrollment(Scanner scanner): Deletes an enrollment from the database.
viewAllEnrollments(): Retrieves and displays all enrollments from the database.
Main
Contains the main method and provides a command-line interface to interact with the system.
Uses menus to navigate between student, course, grade, and enrollment operations.