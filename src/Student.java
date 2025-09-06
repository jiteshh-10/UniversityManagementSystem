/**
 * Represents a student, inheriting basic properties from Person.
 *
 * OOPS Concepts Demonstrated:
 * 1. Inheritance (Single Level): Extends Person.
 * 2. Method Overriding: Provides a specific implementation for 'getRoleDetails'.
 * 3. Method Overloading: 'enrollInCourse' method has two versions with different parameters.
 * 4. Encapsulation (Validation): The 'setMajor' method includes logic to validate input.
 */
public class Student extends Person {
    private String major;

    public Student(String name, int Uid, String major) {
        super(name, Uid);
        this.major = major;
    }

    /**
     * Provides specific role details for a Student.
     * Overrides the abstract method from Person.
     */
    @Override
    public String getRoleDetails() {
        return "Role: Student | Major: " + major;
    }

    /**
     * Updates the student's major with validation.
     * Encapsulation ensures data integrity by preventing invalid values.
     * @param major The new major to set.
     */
    public void setMajor(String major) {
        if (major != null && !major.trim().isEmpty()) {
            this.major = major;
        } else {
            System.out.println("Error: Major cannot be null or empty.");
        }
    }

    // --- Method Overloading Demonstration ---

    /**
     * Overloaded Method 1: Enroll by course name only.
     * @param courseName Name of the course.
     */
    public void enrollInCourse(String courseName) {
        System.out.println(getName() + " enrolled in course: " + courseName);
    }

    /**
     * Overloaded Method 2: Enroll by course name and code.
     * @param courseName Name of the course.
     * @param courseCode Code of the course (e.g., "CS101").
     */
    public void enrollInCourse(String courseName, String courseCode) {
        System.out.println(getName() + " enrolled in course: " + courseCode + ": " + courseName);
    }
}