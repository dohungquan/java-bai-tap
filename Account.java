package BT.JavaCore1;

public class Account {
    //no_borrowed_books, no_reserved_books,
    // no_returned_books, no_lost_books fine_amount
    private int no_borrowed_books;
    private int no_reserved_books;
    private int no_returned_books;
    private int no_lost_books;
    private int fine_amount;

    public Account(int no_borrowed_books, int no_reserved_books, int no_returned_books, int no_lost_books, int fine_amount) {
        this.no_borrowed_books = no_borrowed_books;
        this.no_reserved_books = no_reserved_books;
        this.no_returned_books = no_returned_books;
        this.no_lost_books = no_lost_books;
        this.fine_amount = fine_amount;
    }

    //khi muon sach phai 1 lan so fineamount
    //neu nhu lam mat sach thi can boi thuong gap 10 lan
    public int Calcul_fine (){
        int a = getNo_borrowed_books() * getFine_amount() + getNo_lost_books()*10*getFine_amount();
        return a;
    }

    public int getNo_borrowed_books() {
        return no_borrowed_books;
    }

    public int getNo_reserved_books() {
        return no_reserved_books;
    }

    public int getNo_returned_books() {
        return no_returned_books;
    }

    public int getNo_lost_books() {
        return no_lost_books;
    }

    public int getFine_amount() {
        return fine_amount;
    }
    @Override
    public  String toString(){
        return "Borrowed books : "+getNo_borrowed_books()+"\n"+
                "Reserved books : "+getNo_reserved_books()+"\n"+
                "Lost books : "+getNo_lost_books()+"\n"+
                "Fine amount with a book : "+getFine_amount()+" || " +
                "So tien can phai nop la :  "+ Calcul_fine()+" (Đơn vị tính / Nghìn Vnđ)";
    }
}
