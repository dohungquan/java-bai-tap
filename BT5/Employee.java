package BT5;

public class Employee extends Date {

    private static int currentId = 1;
    private int id;
    private String dpCode;

    public Employee(String dpCode, String firstName, String lastName, int day, int month, int year) {
        super(firstName, lastName, day, month, year);
        this.id = currentId++;
        this.dpCode = dpCode;
    }

    public int getId() {
        return id;
    }

    public String getDpCode() {
        return dpCode;
    }


    @Override
    public String toString() {

        return "ID: " + getId() + "\n" +
                "Department: " + getDpCode() + "\n" +
                "Name: " + getFirstName() + " " + getLastName() + "\n" +
                "BirthDate: " + getDay() + "/" + getMonth() + "/" + getYear() + " " +daysOfWeek();
    }


}
