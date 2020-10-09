package BT8_1;

public class Toller {
    public static void main(String[] args) {
        Ticket onewayTicket = new OneWayTicket(200);
        Ticket perpaiCard = new PrepaidCardTicket(200);

        Line.A.enter(onewayTicket);
        System.out.println(onewayTicket);
        Line.D.exit(onewayTicket);
        System.out.println(onewayTicket);

        System.out.println();

        Line.A.enter(perpaiCard);
        System.out.println(perpaiCard);
        Line.D.exit(perpaiCard);
        System.out.println(perpaiCard);
        System.out.println();
    }
}
