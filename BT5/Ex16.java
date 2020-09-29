package BT5;

public class Ex16 {
    public static void main(String[] args) {
        Ex16Method code1 = new Ex16Method("SSI","Công ty CP chứng khoán SSI");
        code1.setStockCode("SSI");
        code1.setStockName("Công ty CP chứng khoán SSI");
        code1.setPreviousClosingPrice(34.5);
        code1.setCurrentPrice(34.35);
        code1.getChangePercent(code1.getPreviousClosingPrice(),code1.getCurrentPrice());


    }
}
