

public class Professor extends Person implements SalaryCalculable{
    private String dept;
    Professor(String name, int Uid, String dept){
        super(name,Uid);
        this.dept = dept;
    }

    @Override
    public String getRoleDetails() {
        String str = "CSE Department";
        return str;
    }


    @Override
    public double calculateMonthlySalary() {
        return 15000.750;
    }
}
