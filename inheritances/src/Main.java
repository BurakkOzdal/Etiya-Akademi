public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Employee employee=new Employee();
        customer.firstName="Burak";
        employee.firstName="Veli";

        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
        customerManager.List();

        EmployeeManager employeeManager=new EmployeeManager();
        employeeManager.BestEmployee();
        employeeManager.Add();
        employeeManager.List();
    }
}