/**
 * Represents a research student, demonstrating multilevel inheritance.
 * Hierarchy: Person -> Student -> ResearchStudent
 *
 * OOPS Concepts Demonstrated:
 * 1. Multilevel Inheritance: Extends Student, which extends Person.
 * 2. Method Overriding with 'super': Enhances the parent's 'getRoleDetails' method
 * by calling super.getRoleDetails() and appending more information.
 */
public class ResearchStudent extends Student {
    private String thesisTopic;

    public ResearchStudent(String name, int Uid, String major, String thesisTopic) {
        super(name, Uid, major);
        this.thesisTopic = thesisTopic;
    }

    /**
     * Overrides Student's getRoleDetails to add thesis information.
     * Calls the parent method using super.getRoleDetails() to reuse existing logic.
     */
    @Override
    public String getRoleDetails() {
        return super.getRoleDetails() + " | Thesis Topic: " + thesisTopic;
    }
}