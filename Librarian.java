package BT.JavaCore1;

import java.util.ArrayList;

public class Librarian {
    private String name;
    private String id;
    private String passWord;
    
    public Librarian(String name, String id, String passWord) {
        this.name = name;
        this.id = id;
        this.passWord = passWord;
    }
    public boolean verifyLibrarian(String name, String id, String passWord){
        if (this.getName().equals(name) && this.getId().equals(id) && this.getPassWord().equals(passWord)){
            System.out.println("Xac nhan thanh cong !");
            System.out.println("Thong tin >> "+toString());
            return true;
        } else
        System.out.println("Xac nhan khong thanh cong. Xin kiem tra lai");
            return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString(){
        return "Thu thu : "+getName()+" ,"+" ID : "+getId();
    }
}
