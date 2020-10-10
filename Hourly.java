package BT9_1;

public class Hourly extends StaffMember{
private double hourly;
//salaryday : money/hourly
    public Hourly(String name, String phone, String address, String BHXHNumber, double hourly,double salaryday, int workingDays) {
        super(name, phone, address, BHXHNumber, salaryday, workingDays);
        this.hourly = hourly;
    }

    public double getHourly() {
        return hourly;
    }

    @Override
    public double pay() {
        return (getHourly() * getSalaryday())*getWorkingDays() ;
    }

    @Override
    public String toString(){
        return "<->Name : "+getName()+"\n"+
                "Address : "+getAddress()+"\n"+
                "Phone : "+getPhone()+"\n"+
                "Insurance Number : "+getBHXHNumber()+"\n"+
                "Hourly : "+getHourly()+"\n"+
                "Salary : "+pay();
    }
}
