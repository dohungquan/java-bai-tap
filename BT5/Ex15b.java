package BT5;

public class Ex15b {
    public static void main(String[] args) {
        Ex15bMethod rec1 = new Ex15bMethod();
        Ex15bMethod rec2 = new Ex15bMethod();
        double x1 = rec1.Input15b("Nhap vao x1 :");
        double y1 = rec1.Input15b("Nhap vao y1 :");
        double W1 = rec1.Input15b("Nhap vao W1 :");
        double H1 = rec1.Input15b("Nhap vao H1 :");

        double x2 = rec1.Input15b("Nhap vao x2 :");
        double y2 = rec1.Input15b("Nhap vao y2 :");
        double W2 = rec1.Input15b("Nhap vao W2 :");
        double H2 = rec1.Input15b("Nhap vao H2 :");

        rec1.setX1(x1);
        rec1.setY1(y1);
        rec1.setW1(W1);
        rec1.setH1(H1);

        rec2.setX2(x2);
        rec2.setY2(y2);
        rec2.setW2(W2);
        rec2.setH2(H2);

        Ex15bSolution solu = new Ex15bSolution();
        solu.Test15b(rec1.getX1(),rec1.getY1(),rec1.getW1(),rec1.getH1(),
                     rec2.getX2(),rec2.getY2(),rec2.getW2(),rec2.getH2());


    }
}
