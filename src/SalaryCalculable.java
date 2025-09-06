/**
 * Interface defining a contract for objects that can have a salary calculated.
 *
 * OOPS Concepts Demonstrated:
 * 1. Interface: Specifies a capability ('calculateMonthlySalary') that any class can implement,
 * regardless of its position in the inheritance hierarchy.
 */
public interface SalaryCalculable {
    /**
     * Calculates the monthly salary for an employee.
     * @return The calculated monthly salary amount.
     */
    double calculateMonthlySalary();
}