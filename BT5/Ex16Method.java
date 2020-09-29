package BT5;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ex16Method {
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    private String stockCode;
    private String stockName;
    private double previousClosingPrice;
    private double currentPrice;

    Ex16Method(String stockCode, String stockName){
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public void getChangePercent( double previousClosingPrice,double currentPrice){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        if (previousClosingPrice - currentPrice < 0){
            System.out.println("Ma chung khoan : "+stockCode);
            System.out.println("Cong ty : "+stockName);
            System.out.println("Tang so voi phien truoc :   " +df.format((previousClosingPrice - currentPrice)/previousClosingPrice*100)+ " %");
        }else
            System.out.println("Ma chung khoan : "+stockCode);
            System.out.println("Cong ty : "+stockName);
            System.out.println("Giam so voi phien truoc :   " +df.format((previousClosingPrice - currentPrice)/previousClosingPrice*100) +" %");

    }




}
