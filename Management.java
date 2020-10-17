package BT.JavaCore1;

import java.util.List;
import java.util.Scanner;

public class Management {
    private String userType;
    private String userName;
    private String passWord;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    public Management(String userType, String userName, String passWord) {
        this.userType = userType;
        this.userName = userName;
        this.passWord = passWord;
    }
    public String getUserType() {
        return userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    public boolean login() {
        System.out.println("Nhap userName : ");
        String userNameInfo = myObj.nextLine();  // Read user input
        System.out.println("Nhap passWord : ");
        String passWord = myObj.nextLine();  // Read user input
        System.out.println("Nhap userType : ");
        String userType = myObj.nextLine();  // Read user input
        if(this.getUserName().equals(userNameInfo) == true &&
                this.getPassWord().equals(passWord) == true
                && this.getUserType().equals(userType)){
            System.out.println("Dang nhap thanh cong ");
            return  true;

        }else
            System.out.println("Xin hay dang nhap lai !");
        return false;

    }

    public  void register(List<? extends User> newUser) {
        System.out.println("Thong tin nhan duoc tu "+newUser+" : ");
        System.out.println("Nhap userName : ");
        String newUserNameInfo = myObj.nextLine();  // Read user input
        System.out.println("Nhap passWord : ");
        String passWord = myObj.nextLine();  // Read user input
        System.out.println("Xac nhan passWord : ");
        String passWord1 = myObj.nextLine();  // Read user input
        if (passWord.equals(passWord1) == true){
            if (this.getUserName().equals(newUserNameInfo) != true ){
                System.out.println("Dang ky thanh cong voi thong tin nguoi dung "+newUser);
            }else
                System.out.println("Dang ky khong thanh cong !");
        }else {
            for (var i = 0; i < 3;i++){
                System.out.println("Nhap lai mat khau : ");
                String string = myObj.nextLine();  // Read user input
                if (passWord.equals(string) == true){
                    System.out.println("Xac nhan passWord thanh cong");
                    break;
                }
            }
            System.out.println("Xin hay dang ky lai");
        }

    }

    public void logOut() {
        if (login() == true){
            System.out.println("Ban co muon logOut : (y/n)");
            String logOut = myObj.nextLine();  // Read user input
            if (logOut.equals("y"))
                System.out.println("Ban da thoat khoi dang nhap ! ");
            if (logOut.equals("n"))
                System.out.println("Hoan nghenh ban ");
        }else System.out.println("Ban chua dang nhap !");

    }

}
