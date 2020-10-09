package BT8_1;

public class PrepaidCardTicket extends Ticket {
private Gate origin;
    public PrepaidCardTicket(double value) {
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
        return true;
    }

    @Override
    public void adjustValue(double fee) {
        deduct(fee);
    }
    @Override
    public String toString(){
        return "<>Ticket<>\n"+(getOrigin() != null ? "Gate : "+getOrigin().getName() : "")+
                " Card value : "+ getValue();
    }
}
