package BT8_1;

public class OneWayTicket extends Ticket {
    private Gate origin;
    public OneWayTicket(double value) {
        super(value);
    }

    @Override
    public Gate getOrigin() {
        return origin;
    }

    public void setOrigin(Gate origin) {
        if (origin == null){

            this.origin = null;
        }
        else
            this.origin = origin;
    }

    @Override
    public boolean isValid() {
        return getValue() > 0;
    }
    @Override
    public void adjustValue(double fee) {
    }
    @Override
    public String toString(){
        return "<>Ticket<>\nGate : "+(getOrigin() != null ? getOrigin().getName() : "")+"\n"+
                "Ticket value : "+ getValue()+
                "\nTicket valid : " + getValid();
    }
}
