package ObjectCollab2;

class School {
    private String name;
    private Student[] students;
    private int numStudents;
    private int maxStudents;

    public School(String name, int maxStudents) {
        this.name = name;
        this.maxStudents = maxStudents;
        this.students = new Student[maxStudents];
        this.numStudents = 0;
    }

    public void addStudent(Student student) {
        if (numStudents < maxStudents) {
            students[numStudents++] = student;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School{name='").append(name).append('\'');
        sb.append(", students=[");
        for (int i = 0; i < numStudents; i++) {
            sb.append(students[i]);
            if (i < numStudents - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}