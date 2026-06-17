import java.util.ArrayList;

public class EmployeeServiceIml implements EmployeeService {

    private ArrayList<Employee> employees;
    EmployeeServiceIml(){
        employees=new ArrayList<>();
    }
    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Added successfully");
    }

    @Override
    public void updateEmployee(Employee employee,int employeeId, String name, String dept, double salary) {
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(name);
        employee.setDept(dept);
        employee.setSalary(salary);
        System.out.println("updated Successfully");
    }

    @Override
    public void deleteEmployee(int employeeId) {
        for (Employee employee:employees){
            if(employee.getEmployeeId() == employeeId){
                employees.remove(employee);
                System.out.println("deleted successfully");
                return;
            }
        }
    }

    @Override
    public void displayEmployees() {
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }
}
