package BT8_1;

public abstract class Ticket {
    private double value;
    private Gate origin;
    private boolean valid = true;

    public Ticket(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Gate getOrigin() {
        return origin;
    }
    public boolean getValid(){
        return valid;
    }
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setOrigin(Gate origin) {
        if (origin == null){

            this.origin = null;
        }
        else
            this.origin = origin;
    }
    public void deduct(double fee){
        value -= fee;
    }
    public abstract boolean isValid();
    public abstract void adjustValue(double fee);
    @Override
    public String toString(){
        return "Gate : "+(getOrigin() != null ? getOrigin().getName() : "")+"\n"+
                "Ticket value : "+ getValue()+
                "\nTicket valid : " + getValid();

    }

}
