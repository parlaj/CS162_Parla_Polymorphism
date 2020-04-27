import java.util.ArrayList;

public class Owner{
    private String name;
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public Owner() {

    }

    public Owner(String name) {
        this.name = name;
    }
    public void hireEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public ArrayList<Employee> getEmployeeList(){
        return employeeList;
    }

    public void giveRaise(Employee employee, double raisePercent){
        employee.setBaseSalary(employee.getBaseSalary()*raisePercent+employee.getBaseSalary());

    }

}
