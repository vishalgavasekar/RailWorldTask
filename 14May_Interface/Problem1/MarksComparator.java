package Interface;

class MarksComparator {
    public static void compare(Student student1, Student student2) {
        int result = student1.compareTo(student2);
        if (result > 0) {
            System.out.println(student1.getName() + " has higher marks than " + student2.getName());
        } else if (result < 0) {
            System.out.println(student1.getName() + " has lower marks than " + student2.getName());
        } else {
            System.out.println(student1.getName() + " has equal marks to " + student2.getName());
        }
    }
}