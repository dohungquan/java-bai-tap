package BT.JavaCore1;

import java.util.ArrayList;

public class Database {
    private ArrayList<Book> list ;

    public Database() {
        this.list = new ArrayList<>();
    }

    public  boolean add(Book newBook){
        list.add(newBook);
        return true;
    }

    public Book search(String searchName) {
        for (Book item : list)
            if (item.getTitle().contains(searchName))
                return item;
            return null;
    }


    public  void delete(Book o){
        boolean status ;
        if (list.contains(o)){
            status = true;
        }else status = false;
        if (status == true){
            list.remove(o);
            System.out.println("Xoa doi tuong thanh cong ");
            for (var book : list) {
                System.out.println(book);
            }
        }
    }


    public void update(Book book1,Book book2){

        if (list.contains(book1)){
            int index = list.indexOf(book1);
            list.set(index,book2);
            System.out.println("Cap nhat thanh cong");
        }
        for (var book : list) {
            System.out.println(book);

        }
    }

    public void display(){

        for (var book : list) {
            System.out.println(book);

        }
    }


}
