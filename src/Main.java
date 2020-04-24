import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TechnicalWriter technicalWriter = new TechnicalWriter("Mark", 50000, 4, 2);
        //System.out.println(technicalWriter.toString());
        System.out.println();
        Engineer engineer = new Engineer("Natashia", 50000, 7, 2);
        //System.out.println(engineer.toString());
        System.out.println();
        ProductManager productManager = new ProductManager("Carlos", 50000, 8, 5);
        //System.out.println(productManager.toString());
        System.out.println();
        Boss boss = new Boss("Jeff", 50000, 12, 10);

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(technicalWriter);
        employeeList.add(engineer);
        employeeList.add(productManager);
        for (Employee employee : employeeList) {
            if(employee instanceof Engineer){
                boss.giveRaise(employee, .25);
            }
            System.out.println(employee.toString());
            System.out.println();
        }

    }
}