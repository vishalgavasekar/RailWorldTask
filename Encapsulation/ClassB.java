package Encapsulation;
import java.util.Scanner;

public class ClassB{
    Scanner sc = new Scanner(System.in);

    void meth1(){
        ClassA A = new ClassA();
        System.out.println("Please Enter Your Name : ");
        A.setEmpName(sc.nextLine());

        System.out.println("Please Enter Your ID : ");
        A.setEmpId(sc.nextInt());

        System.out.println("Enter Your Dept : ");
        A.setEmpDept(sc.next());

        System.out.println("___________Information Entered By Employee________________________");
        System.out.println(A.getEmpName());
        System.out.println(A.getEmpId());
        System.out.println(A.getEmpDept());


    }

    public static void main(String[] args) {
        new ClassB().meth1();

    }

}