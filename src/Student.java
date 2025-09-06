

public class Student extends Person{
    private String major;

    public Student(String name, int Uid, String major) {
        super(name, Uid);
        this.major = major;
    }

    @Override
    public String getRoleDetails() {
        displayUniversityID();
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void enrollInCourse(String courseName){
        System.out.println("Enrolled in:"+courseName);
    }
    void enrollInCourse(String courseName, String courseCode){
        System.out.println("Enrolled in: "+courseCode+": "+courseName);
    }
}
