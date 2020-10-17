package BT.JavaCore1;

public class Staff extends User{
private String dept;
    public Staff( String name, String id,String dept) {
        super(name, id);
        this.dept = dept;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+
                "Department : "+ getDept();
    }

    public String getDept() {
        return dept;
    }
}
