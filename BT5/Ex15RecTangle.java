package BT5;


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ex15RecTangle {

    private double width;
    private double height;
    Ex15RecTangle(double width, double height){

        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width == 0 || width < 0){
            width = 1;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height == 0 || height < 0){
            height = 1;
        }

        this.height = height;
    }

    public String getArea(double width, double height) {
        double area = width * height;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        df.format(area);
        return df.format(area);
    }
    public String getPerimeter(double width, double height) {
        double per =  2 * (width + height);
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        df.format(per);
        return df.format(per) ;
    }
    public void Display(){
        System.out.println("Hinh chu nhat co Chieu Dai : " +getWidth() + "\tChieu Rong : "+getHeight());
        System.out.println(">>>>>>>> Dien tich : "+getArea(getWidth(),getHeight())+"\t\tChu vi : "+getPerimeter(getWidth(), getHeight()));
        System.out.println();

    }




    }
