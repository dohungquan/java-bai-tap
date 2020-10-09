package BT8_2;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new CurrentAccount("12345",4_000_000);
        System.out.println(account1);

        Account account2 = new CurrentPlusAccount("12459",2_000_000,50_000,0.05,5_000);
        System.out.println(account2);
        account2.deduct(1_500_000);
        System.out.println(account2);

        try {
            account2.deduct(3_500_000);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Account account3 = new SavingsAccount("24624",10_000_000,100_000,0.1,10_000);
        System.out.println(account3);
    }
}
