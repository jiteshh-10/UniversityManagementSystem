/**
 * Represents a professor, inheriting from Person and implementing SalaryCalculable.
 *
 * OOPS Concepts Demonstrated:
 * 1. Interface Implementation: Implements the 'SalaryCalculable' interface.
 * 2. Method Overriding: Provides implementations for 'getRoleDetails' from Person
 * and 'calculateMonthlySalary' from SalaryCalculable.
 */
public class Professor extends Person implements SalaryCalculable {
    private String department;

    public Professor(String name, int Uid, String department) {
        super(name, Uid);
        this.department = department;
    }

    /**
     * Provides specific role details for a Professor.
     * Overrides the abstract method from Person.
     */
    @Override
    public String getRoleDetails() {
        return "Role: Professor | Department: " + department;
    }

    /**
     * Calculates the professor's salary as defined by the SalaryCalculable interface.
     */
    @Override
    public double calculateMonthlySalary() {
        // Salary calculation logic could be complex here in a real application.
        return 15000.75;
    }
}