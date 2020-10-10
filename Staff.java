package BT9_1;

public class Staff {

    public void payday(){
    StaffMember staff[] = {
            new Employee("Cường","123-456","123 Đinh Tiên Hoàng","123-45-6789",200,25,0),
            new Executive("Vân","123-789","Hà Đông - Hà Nội","978-65-4321",300,22,2000),
            new Employee("Phúc","789 Mai Hắc Đế","555-0000"," 010-20-3040",400,20,5000),
            new Hourly("Tuân","148-2858","Long Biên - Hà Nội","475-25820-25",50,40,25)
    } ;
    staff[0].setBonus(1000);
    for (int i = 0; i < staff.length; i++){
        System.out.println(staff[i]);
    }

    }
}
