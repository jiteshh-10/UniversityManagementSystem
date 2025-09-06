import java.util.ArrayList;
import java.util.List;

public class UniversityManager {
    public static void main(String[] args) {
        Student s1 = new Student("Jitesh", 10, "CSE");
        Student s2 = new Student("Adarsh", 14,"CSE");
        Professor p1 = new Professor("Ashish",21,"CS");
        ResearchStudent r1 = new ResearchStudent("ajay",20,"CSE", "AIML");
        List<Person> ls = new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(p1);
        ls.add(r1);

        for(Person p : ls){
            System.out.println(p.getRoleDetails());
            p.displayUniversityID();
            System.out.println();
        }
        System.out.println(p1.calculateMonthlySalary());
        s1.enrollInCourse("DS");
        s1.enrollInCourse("DS", "CD25");

    }
}
