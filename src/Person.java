/**
 * Represents a person within the university.
 *
 * OOPS Concepts Demonstrated:
 * 1. Abstract Class: 'Person' is abstract because a generic "person" object doesn't make sense in this context.
 * You must create a specific role like Student or Professor. It cannot be instantiated directly.
 * 2. Encapsulation: Attributes 'name' and 'Uid' are private, accessible only within this class.
 * 3. Final Keyword (Variable): 'Uid' is final, meaning once set in the constructor, it cannot be changed.
 */
public abstract class Person {
    private String name;
    private final int Uid;

    public Person(String name, int Uid) {
        this.name = name;
        this.Uid = Uid;
    }

    /**
     * Abstract method to be implemented by all subclasses.
     * Forces subclasses to define how they describe their specific role.
     * @return A string describing the person's role and details.
     */
    public abstract String getRoleDetails();

    /**
     * Final method that cannot be overridden by subclasses.
     * Ensures consistent display logic for critical information across all person types.
     */
    public final void displayUniversityID() {
        System.out.println("University ID: " + Uid + " | Name: " + name);
    }

    // Getter for name, useful for subclasses if needed
    public String getName() {
        return name;
    }
}