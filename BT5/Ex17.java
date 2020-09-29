package BT5;

public class Ex17 {

        public static void main(String[] args) {
            var customers1 = new Account(1, 40000);
            customers1.setAnnualInterestRate(6);
            System.out.println(customers1.withdraw(60000));
            System.out.println(customers1.getBalance());
            System.out.println(customers1.getMonthlyInterest());
            System.out.println(customers1.deposit(50000));
            System.out.println(customers1.getBalance());

        }


}
