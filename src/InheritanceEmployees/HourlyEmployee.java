package InheritanceEmployees;

public class HourlyEmployee extends Employee {

    private int wage;
    private int numberHoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          int wage, int numberHoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.numberHoursWorked = numberHoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getNumberHoursWorked() {
        return numberHoursWorked;
    }

    public void setNumberHoursWorked(int numberHoursWorked) {
        this.numberHoursWorked = numberHoursWorked;
    }
}
