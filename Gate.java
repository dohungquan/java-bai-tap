package BT8_1;

public class Gate {
    private String name;
    private double distance;
    private int dis;
    private int fare;

    public int getDis() {
        return dis;
    }
    public int getFare() {
        return fare;
    }
    public Gate(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }
    public void enter(Ticket ticket){
        if (ticket.isValid() == true){
            open();
            ticket.setOrigin(this);
        }else
            close();
    }
    public void exit(Ticket ticket){
        Gate origin = ticket.getOrigin();
        if (origin != null){
            dis = (int)Math.abs(distance - origin.distance);
            fare = Line.getFare(dis);
            if (ticket.getValue() >= fare){
                ticket.adjustValue(fare);
                ticket.setOrigin(null);
                ticket.setValid(false);
                open();
            }else{
                close();
                System.out.println("Fare : "+fare);
            }
        }
    }

    public void open(){
        System.out.println("Gate : "+name+" is opened");
    }
    public void close(){
        System.out.println("Gate : "+name+" is closed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}

