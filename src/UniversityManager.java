import java.util.ArrayList;
import java.util.List;

/**
 * Main simulation class to demonstrate OOPS principles in action.
 */
public class UniversityManager {
    public static void main(String[] args) {
        // --- Object Instantiation ---
        Student s1 = new Student("Jitesh", 10, "Computer Science");
        Student s2 = new Student("Adarsh", 14, "Electronics");
        Professor p1 = new Professor("Ashish", 21, "Computer Science");
        ResearchStudent r1 = new ResearchStudent("Ajay", 20, "Computer Science", "AI Model Optimization");

        // --- Polymorphic Collection ---
        // Creating a list of type Person, holding objects of subclasses Student, Professor, and ResearchStudent.
        List<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(p1);
        people.add(r1);

        System.out.println("--- University Role Call (Demonstrating Polymorphism) ---");
        // --- Dynamic Method Dispatch Demonstration ---
        // Java determines at runtime which version of getRoleDetails() to call based on the object's actual type.
        // For s1, it calls Student.getRoleDetails(). For r1, it calls ResearchStudent.getRoleDetails().
        for (Person p : people) {
            p.displayUniversityID(); // Calls final method from Person class
            System.out.println(p.getRoleDetails()); // Dynamic dispatch in action

            // Check specific type to call methods unique to that type or interface
            if (p instanceof Professor) {
                Professor prof = (Professor) p; // Type casting
                System.out.println("Salary: $" + prof.calculateMonthlySalary());
            }
            System.out.println("----------------------------------------");
        }

        System.out.println("\n--- Method Overloading Test ---");
        s1.enrollInCourse("Data Structures");
        s1.enrollInCourse("Advanced Algorithms", "CS301");
    }
}