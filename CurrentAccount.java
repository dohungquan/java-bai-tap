package BT8_2;

public class CurrentAccount extends Account{

    public CurrentAccount(String id, double firstValue) {
        super(id, firstValue);
    }

    @Override
    public double monthlyInterest() {
        return 0;
    }
    @Override
    public String toString(){
        return "Account : "+getId()+"\nSo du : "+getFirstValue()+"\n";
    }


}
