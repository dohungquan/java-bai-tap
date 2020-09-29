package BT5;

public class BirthdayRooster {
    public static void main(String[] args) {
        var emp1 = new Employee("IT", "Chu", "Chi Cuong", 7, 7, 1974);
        var emp2 = new Employee("AC","Nguyen","Xuan Phuc",4,29,1980);
        var emp3 = new Employee("HR","Pham","Sy Tam",10,25,1991);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());


    }
}
