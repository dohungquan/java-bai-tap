package BT9_1;

public class Employee extends StaffMember{
private double bonus;

    public Employee(String name, String phone, String address, String BHXHNumber, double salaryday, int workingDays,double bonus) {
        super(name, phone, address, BHXHNumber, salaryday, workingDays);
        this.bonus = bonus;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        return getSalaryday()*getWorkingDays() + getBonus();
    }
    @Override
    public String toString(){
        return "<->Name : "+getName()+"\n"+
                "Address : "+getAddress()+"\n"+
                "Phone : "+getPhone()+"\n"+
                "Insurance Number : "+getBHXHNumber()+"\n"+
                "Salary : "+pay();
    }
}
