

public class Student extends Person{
    private String major;

    public Student(String name, int Uid, String major) {
        super(name, Uid);
        this.major = major;
    }

    @Override
    public String getRoleDetails() {
        return major;
    }
}
