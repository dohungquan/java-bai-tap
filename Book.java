package BT.JavaCore1;

import java.util.Scanner;

public class Book {
    //Tên sách, Tác giả, ISBN, Xuất bản
    private String title;
    private String author;
    private String bookCode;
    private String publication;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object


    public Book(String title, String author, String bookCode, String publication) {
        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        this.publication = publication;
    }
    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void reservationStatus(){
        System.out.println("Hay dien thong tin vao form nhung tai lieu ban muon dat : ");
        String reservationInfo = myObj.nextLine();  // Read user input
        System.out.println("Da nhan duoc thong tin. Dang xac nhan. Chi tiet se duoc thong bao toi ban sau");
        System.out.println("Xin cam on da su dung dich vu cua chung toi");
    }

    public void feedBack(){
        System.out.println("Dien thong tin phan hoi vao form : ");
        String feedBackInfo = myObj.nextLine();  // Read user input
        System.out.println("Thong tin phan hoi : " + feedBackInfo);
        System.out.println("Da nhan duoc phan hoi. Xin cam on da su dung dich vu cua chung toi");

    }

    public void bookRequest(){
        System.out.println("Dien thong tin sach ban muon muon : ");
        String bookRequestInfo = myObj.nextLine();  // Read user input
//        System.out.println("Thong tin phan hoi : " + bookRequestInfo);
        System.out.println("Xac nhan tu thu thu : (y/n)");
        String answerRequest = myObj.nextLine();  // Read user input
        if (answerRequest.equals("y")){
            System.out.println("Cac sach ban duoc muon"+bookRequestInfo);
        }else if (answerRequest.equals("n")){
            System.out.println("Khong co sach yeu cau. Xin quay lai sau");
        }
        System.out.println("Xin cam on da su dung dich vu cua chung toi");
    }

    public void renewInfo(){
        System.out.println("Ban muon gia han nhung sach nao , thoi han nhu the nao."+"\n" +"Hay dien thong tin chi tiet vao form");
        String bookRequestInfo = myObj.nextLine();  // Read user input
        System.out.println("Xac nhan dong y tu thu thu : (y/n)");
        String answer = myObj.nextLine();  // Read user input
        if (answer.equals("y")){
            System.out.println("Da nhan duoc thong tin");
            System.out.println("Gia han thanh cong");
        }else if (answer.equals("n")){
            System.out.println("Gia han khong thanh cong");
        }
        System.out.println("Xin cam on da su dung dich vu cua chung toi");
    }

    @Override
    public String toString(){
        return "Title book : "+getTitle()+"\n"+
                "Author book : "+getAuthor()+"\n"+
                "Book Code : "+getBookCode()+"\n"+
                "Publication : "+getPublication()+"\n";
    }
}
