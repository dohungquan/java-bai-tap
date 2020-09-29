package BT5;

public class Ex15 {
    public static void main(String[] args) {
        Ex15RecTangle rec1 = new Ex15RecTangle(40,4);
        Ex15RecTangle rec2 = new Ex15RecTangle(35.9,3.5);
        Ex15RecTangle rec3 = new Ex15RecTangle(-2,-2);

        rec1.setWidth(40);
        rec1.setHeight(4);
        rec1.getArea(rec1.getWidth(),rec1.getHeight());
        rec1.getPerimeter(rec1.getWidth(),rec1.getHeight());
        rec1.Display();

        rec2.setWidth(35.9);
        rec2.setHeight(3.5);
        rec2.getArea(rec2.getWidth(),rec2.getHeight());
        rec2.getPerimeter(rec2.getWidth(),rec2.getHeight());
        rec2.Display();

        rec3.setWidth(0);
        rec3.setHeight(-2);
        rec3.getArea(rec3.getWidth(),rec3.getHeight());
        rec3.getPerimeter(rec3.getWidth(),rec3.getHeight());
        rec3.Display();



    }
}
