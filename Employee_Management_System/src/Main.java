public class Main {
    public static void main(String[] args) {
        //Employee
        Employee emp1=new Employee(1,"reva","Development",900000);
        Employee emp2=new Employee(2,"john","Development",600000);

        //Employee service
        EmployeeService employeeService=new EmployeeServiceIml();

        //Add
        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);

        //Display
        employeeService.displayEmployees();

        //update
        employeeService.updateEmployee(emp1,1,"revathi","IT",1000000);

        employeeService.displayEmployees();

        //delete
        employeeService.deleteEmployee(2);

        employeeService.displayEmployees();

    }
}