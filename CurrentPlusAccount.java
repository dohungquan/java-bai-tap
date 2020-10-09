package BT8_2;

public class CurrentPlusAccount extends Account {
private double annualRate;
private final int  MONTH = 12;
private double min;
private double charge;
    public CurrentPlusAccount(String id, double firstValue,double min,double annualRate,double charge) {
        super(id, firstValue);
        this.min = min;
        this.annualRate = annualRate;
        this.charge = charge;
    }

    @Override
    public double monthlyInterest() {
        if (getFirstValue() > min)
             return getFirstValue()*annualRate/MONTH;
        else
            return 0;
    }
    public void clearCheck(double amount){
        if (getFirstValue() < amount){
            throw new IllegalArgumentException(">>>So du khong du<<<");
        }
        deduct(amount + charge);
    }
    @Override
    public String toString(){
        return "Account : "+getId()+"\nSo du : "+getFirstValue()+"\nLai suat hang thang : "+monthlyInterest()+"\n";
    }

}
