package InheritanceEmployees;

public class CommissionEmployee extends Employee {

    private double commissionRate;
    private int grossSalary;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double commissionRate, int grossSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;
    }
}
