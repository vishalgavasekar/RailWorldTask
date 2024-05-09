package ObjectCollab2;

class Student {
    private String name;
    private int rollNumber;
    private Subject[] subjects;
    private int numSubjects;

    public Student(String name, int rollNumber, int maxSubjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new Subject[maxSubjects];
        this.numSubjects = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void addSubject(Subject subject) {
        if (numSubjects < subjects.length) {
            subjects[numSubjects++] = subject;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{name='").append(name).append('\'');
        sb.append(", rollNumber=").append(rollNumber);
        sb.append(", subjects=[");
        for (int i = 0; i < numSubjects; i++) {
            sb.append(subjects[i]);
            if (i < numSubjects - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
