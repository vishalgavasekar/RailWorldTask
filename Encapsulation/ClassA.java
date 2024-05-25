package Encapsulation;
public class ClassA{
   private String empName;
   private int empId;
   private  String empDept;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {  //Assigning the value to our instance variable
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) { //Assigning the value to our instance variable
        this.empId = empId;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {  //Assigning the value to our instance variable
        this.empDept = empDept;
    }
}