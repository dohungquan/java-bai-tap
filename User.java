package BT.JavaCore1;

public class User {
private String name;
private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public boolean verify(String name, String id) {
        if (this.getName().equals(name) && this.getId().equals(id)) {
            System.out.println("Xac nhan thanh cong");
            return true;
        }
        System.out.println("Khong the xac nhan thanh cong");
        return false;
    }
    public String checkAccount(Account account){
        return account.toString();
    }
    public String getBookInfo(Book book){
        return book.toString();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String toString(){
        return
                "Name : "+getName()+"\n"+
                "User Type : "+getId();

    }

}
