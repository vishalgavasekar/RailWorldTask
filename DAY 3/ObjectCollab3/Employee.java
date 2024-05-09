package ObjectCollab3;

class Employee{
    Integer id;
    String Name;
    Integer salary;
    Address address; // instance member

    void printEmployeeDetails(Employee emp){
        System.out.println(emp);
        System.out.println(emp.id);
        System.out.println(emp.Name);
        System.out.println(emp.salary);
        System.out.println(emp.address);
        System.out.println(emp.address.city);
        System.out.println(emp.address.state);
        System.out.println(emp.address.pincode);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id=1;
        emp.Name="karan";

        emp.address= new Address();
        emp.address.city="Dausa";
        emp.address.state="rajasthan";
        emp.address.pincode="416509";


        emp.printEmployeeDetails(emp);
    }
}