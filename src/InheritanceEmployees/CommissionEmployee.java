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

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return super.toString() + commissionRate + " " + grossSalary;
    }
}
