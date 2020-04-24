public class Boss extends Employee{
    public Boss() {
        super();
    }

    public Boss(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary*2.5, yearsOfExperience, yearsAtCompany);
    }

    public void giveRaise(Employee employee, double raisePercent){
        employee.setBaseSalary(employee.getBaseSalary()*raisePercent+employee.getBaseSalary());

    }

}
