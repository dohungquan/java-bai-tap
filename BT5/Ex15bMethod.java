package BT5;

import java.util.Scanner;

public class Ex15bMethod {
    public double getW1() {
        return W1;
    }

    public void setW1(double w1) {
        W1 = w1;
    }

    public double getH1() {
        return H1;
    }

    public void setH1(double h1) {
        H1 = h1;
    }

    public double getW2() {
        return W2;
    }

    public void setW2(double w2) {
        W2 = w2;
    }

    public double getH2() {
        return H2;
    }

    public void setH2(double h2) {
        H2 = h2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    private double W1;
    private double H1;
    private double W2;
    private double H2;

    private double x1;
    private double x2;
    private double y1;
    private double y2;



    public double Input15b(String mess){
        Scanner input = new Scanner(System.in);
        System.out.println(mess);
         double value = input.nextDouble();
        return value;
    }


//    public void Test15b(double x1, double y1, double W1,double H1, double x2, double y2, double W2, double H2){
//        double disx = 0 ;
//        double disy = 0 ;
//        if ((x1 > 0 && x2 > 0)|| (x1 < 0 && x2 < 0)){
//            disx += Math.abs( x1 - x2);
//        }else
//            if ((x1 > 0 && x2 < 0)||(x1 < 0 && x2 > 0)){
//                disx += Math.abs(x1)  + Math.abs(x2);
//            }
//        if ((y1 > 0 && y2 > 0)|| (y1 < 0 && y2 < 0)){
//            disy += Math.abs( y1 - y2);
//        }else
//        if ((y1 > 0 && y2 < 0)||(y1 < 0 && y2 > 0)){
//            disy += Math.abs(y1)  + Math.abs(y2);
//        }
//
//        if ((disx <= Math.abs(W1 - W2)/2) && (disy <= Math.abs(H1 - H2)/2)){
//            System.out.println("Hai hinh chu nhat nam trong nhau");
//        }
//        else
//            if ((disx <= Math.abs(W1 + W2)/2 )&& (disy <= Math.abs(H1 - H2)/2)){
//                System.out.println("Hai hinh chu nhat giao nhau");
//            }
//            else System.out.println("Hai hinh chu nhat nam ngoai nhau");
//
//    }





}
