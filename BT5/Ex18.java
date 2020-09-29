package BT5;

public class Ex18 {
    public static void main(String[] args) {
        Ex18Method pt1 = new Ex18Method();
        double a =  pt1.InputEx18("Nhap vao a : ");
        double b =  pt1.InputEx18("Nhap vao b : ");
        double c =  pt1.InputEx18("Nhap vao c :");
        pt1.setA(a);
        pt1.setB(b);
        pt1.setC(c);
        pt1.CaculateEx18(pt1.getA(),pt1.getB(),pt1.getC());

        Ex18 test1 = new Ex18();
        test1.TestPT(pt1.getA(),pt1.getB(),pt1.getC(), pt1.getX1(),  pt1.getX2());

    }

    public void TestPT(double a,double b,double c,double x1, double x2){

        if ((c + b*x1 + a*x1*x1 == 0) && (c + b*x2 + a*x2*x2 == 0)){
            System.out.println("Phuong trinh co nghiem voi ket qua chinh xac");

            if (a == 0 && b == 0){
            System.out.println("Ket qua : PT Vo nghiem");
        }
        if((x1 == (-c/b)) && (x2 == (-c/b))) {
            System.out.println("Ket Qua : PT Chi co mot nghiem");
        }else if((x1 == (-b/2/a))&&(x2 == -b/2/a)){
            System.out.println("Ket qua : PT co Nghiem Kep ");
        }
       }


    }
}
