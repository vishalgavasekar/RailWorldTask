package STUDENT_INFO;

public class Grade {
    private int id;
    private int studentId;
    private int courseId;
    private String grade;

    public Grade(int id, int studentId, int courseId, String grade) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = this.courseId;
        this.grade = grade;
    }

    public Grade(int studentId, int courseId, String grade) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
    }

// Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", grade='" + grade + '\'' +
                '}';
    }
}