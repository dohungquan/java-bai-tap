package BT.JavaCore1;

public class Student extends User {
private String className;
private Account account;

    public Student(String name, String id,String className,Account account) {
        super(name, id);
        this.className = className;
        this.account = account;
    }



    public String getClassName() {
        return className;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+
                "Class Name : "+getClassName();
    }
}
