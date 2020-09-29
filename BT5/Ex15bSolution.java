package BT5;

public class Ex15bSolution {
    public void Test15b(double x1, double y1, double W1,double H1, double x2, double y2, double W2, double H2){
        double disx = 0 ;
        double disy = 0 ;
        if ((x1 > 0 && x2 > 0)|| (x1 < 0 && x2 < 0)){
            disx += Math.abs( x1 - x2);
        }else
        if ((x1 > 0 && x2 < 0)||(x1 < 0 && x2 > 0)){
            disx += Math.abs(x1)  + Math.abs(x2);
        }
        if ((y1 > 0 && y2 > 0)|| (y1 < 0 && y2 < 0)){
            disy += Math.abs( y1 - y2);
        }else
        if ((y1 > 0 && y2 < 0)||(y1 < 0 && y2 > 0)){
            disy += Math.abs(y1)  + Math.abs(y2);
        }

        if ((disx <= Math.abs(W1 - W2)/2) && (disy <= Math.abs(H1 - H2)/2)){
            System.out.println("Hai hinh chu nhat nam trong nhau");
        }
        else
        if ((disx <= Math.abs(W1 + W2)/2 )&& (disy <= Math.abs(H1 - H2)/2)){
            System.out.println("Hai hinh chu nhat giao nhau");
        }
        else System.out.println("Hai hinh chu nhat nam ngoai nhau");

    }

}
