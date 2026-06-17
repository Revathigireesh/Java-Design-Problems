import java.time.temporal.Temporal;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String dept;
    private double salary;

    Employee(int employeeId,String employeeName,String dept,double salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.dept=dept;
        this.salary=salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return
                employeeId + " " +
                        employeeName +  " " +
                        dept + " " +
                        salary;
    }
}
