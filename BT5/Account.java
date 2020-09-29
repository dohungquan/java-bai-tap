
package BT5;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private final int MONTHS_IN_YEAR = 12;
    private final int PERCENT = 100;

    public Account() {

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / MONTHS_IN_YEAR;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate() / PERCENT;
    }

    public double withdraw(int money) {
        double withdraw = 0;
        if(money > balance) {
            System.out.println("Giao dịch không thành công");
        } else {
            withdraw = money;
            balance = balance - money;
        }
        return withdraw;
    }

    public double deposit(int money) {
        return balance = balance + money;
    }
}
