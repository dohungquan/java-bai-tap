package BT5;

import java.util.Scanner;

public class Ex18Method {

//    Ex18Method(double a, double b, double c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // giai phuong trinh bac hai
    private double a;
    private double b;
    private double c;

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
    private double x1;
    private double x2;

    public  double InputEx18(String mess){
        Scanner input = new Scanner(System.in);
        System.out.println(mess);
        double value = input.nextDouble();
        return value;
    }
    public void CaculateEx18(double a, double b, double c){
        // tính delta
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                x1 = x2 = (double) (-c/b);
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        }

        // tính nghiệm
        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = x2 = (double) (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }

    }


}
