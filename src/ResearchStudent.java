

public class ResearchStudent extends Student{
    private String thesisTopic;

    public ResearchStudent(String name, int Uid, String major, String thesisTopic) {
        super(name, Uid, major);
        this.thesisTopic = thesisTopic;
    }

    @Override
    public String getRoleDetails() {
        return super.getRoleDetails() + " "+thesisTopic;
    }

}
