package BT9_1;

public class Volunteer extends StaffMember{


    public Volunteer(String name, String phone, String address, String BHXHNumber, double salaryday, int workingDays) {
        super(name, phone, address, BHXHNumber, salaryday, workingDays);
    }

    @Override
    public double pay() {
        return 0;
    }
}
