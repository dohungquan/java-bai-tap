package BT8_2;

public abstract class Account {
    private String id;
    private double firstValue;

    public Account(String id, double firstValue) {
        this.id = id;
        this.firstValue = firstValue;
    }
    public abstract double monthlyInterest();
    public void deposit(double amount){
        firstValue += amount;
    }
    public void deduct(double amount){
        if (firstValue < amount){
            throw new IllegalArgumentException(">>>Khong du so du<<<");
        }
        else firstValue -= amount;
    }

    public String getId() {
        return id;
    }

    public double getFirstValue() {
        return firstValue;
    }
    @Override
    public String toString(){
        return "Account : "+id+"\nSo du : "+getFirstValue()+"\n";
    }
}
