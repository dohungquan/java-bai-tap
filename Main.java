package BT.JavaCore1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //book
        Book book1 = new Book("Con duong to lua","Van Toan","12783","10/10/1995");
        Book book2 = new Book("Introduce Java","Toan Quoc Chinh","12853","10/10/1993");
        Book book3 = new Book("Introduce PHP","Tran Trong Binh","12253","1/08/2020");
        Book book4 = new Book("Tam ly hoc","Nguyen Van Tinh","1056","16/04/2001");
        Book book5 = new Book("Giao duc va moi truong","Dong Quoc Binh","45853","08/01/2008");
        Book book6 = new Book("Cong nghe xay dung","Ma Van Xuong","2582","28/03/2010");
        Book book7 = new Book("Java and JavaScript","Ho Duyen Chuoc","11453","12/09/2016");

        //account
        Account account1 = new Account(2,2,0,1,100);
        Account account2 = new Account(1,1,5,1,100);

        //student
        var studentList = new StudentList();
        studentList.add(new Student("Van Tam","1482","A1",account1));
        studentList.add(new Student("Nguyen Tuan","155","A0",account2));

        System.out.println(studentList.search("Van Tam"));
//        Student student1 = new Student("Van Tam","1482","A1",account1);
//        Student student2 = new Student("Nguyen Tuan","155","A0",account2);

//        System.out.println(student1.checkAccount(account1));
        //staff
        Staff staff1 = new Staff("Huyen Minh","148","nhan vien");
        Staff staff2 = new Staff("Nhi Lao","114","nhan vien");
        Staff staff3 = new Staff("Thu Cuc","482","ke toan");

        //librarian
        Librarian librarian = new Librarian("Vu Xuan","001","123486");
        librarian.verifyLibrarian("Vu Xuan","001","123486");


        //Database
//        Database database1 = new Database();
//        database1.add(book1);
//        database1.add(book2);
//        database1.add(book3);
//        database1.add(book4);
//        database1.add(book5);
//        database1.add(book6);
//        database1.add(book7);
//        database1.display();

//        database1.update(book2,book7);
//
//        database1.search("Introduce PHP");
//        database1.delete(book3);










    }
}
