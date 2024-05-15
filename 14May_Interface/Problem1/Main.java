package Interface;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 90);
        Student student2 = new Student("Bob", 90);

        MarksComparator.compare(student1, student2);
    }
}