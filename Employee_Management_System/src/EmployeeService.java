
public interface EmployeeService {

   void  addEmployee(Employee employee);
   void deleteEmployee(int employeeId);
   void updateEmployee(Employee employee,int employeeId,String name,String dept,double salary);
   void displayEmployees();

}
