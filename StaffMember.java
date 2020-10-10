package BT9_1;

public abstract class StaffMember {
    private String name;
    private String phone;
    private String address;
    private String BHXHNumber;
    private double salaryday;
    private int workingDays;
    private double bonus;

    public StaffMember(String name, String phone, String address, String BHXHNumber, double salaryday, int workingDays) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.BHXHNumber = BHXHNumber;
        this.salaryday = salaryday;
        this.workingDays = workingDays;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalaryday() {
        return salaryday;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBHXHNumber() {
        return BHXHNumber;
    }

    public void setBHXHNumber(String BHXHNumber) {
        this.BHXHNumber = BHXHNumber;
    }
    public abstract double pay();
    @Override
    public String toString(){
        return "<->Name : "+getName()+"\n"+
                "Address : "+getAddress()+"\n"+
                "Phone : "+getPhone()+"\n"+
                "Insurance Number : "+getBHXHNumber();
    }
}
