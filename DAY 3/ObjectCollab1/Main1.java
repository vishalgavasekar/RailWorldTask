package ObjectCollab1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        // Address address=new Address();
        Scanner sc = new Scanner(System.in);
        employee.setName(sc.nextLine());
        sc.close();
        employee.setAddress(new Address("2", "sada", "addsa", 12233));
        // address.setCity("raipur");
        // address.setState("cg");
        // address.setPin(122345);
        // System.out.println(employee.getName());
        System.out.println(employee.toString());
    }
}
