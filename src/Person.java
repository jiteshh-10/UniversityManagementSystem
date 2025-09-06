

public abstract class Person {
    private String name;
    private final int Uid;

    Person(String name, int Uid){
        this.name = name;
        this.Uid = Uid;
    }
    public abstract String getRoleDetails();
     public final void displayUniversityID(){
        System.out.println("Name is: "+name);
        System.out.println("University ID: "+Uid);
    }
}
