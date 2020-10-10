package BT9_1;

public class Executive extends Employee{
private final double levelRank = 0.1;

    public Executive(String name, String phone, String address, String BHXHNumber, double salaryday, int workingDays, double bonus) {
        super(name, phone, address, BHXHNumber, salaryday, workingDays, bonus);
    }


    @Override
    public double pay() {
        return (getSalaryday()*getWorkingDays()) * (1 + levelRank ) + getBonus();
    }


}
