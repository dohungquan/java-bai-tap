package BT.JavaCore1;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public Student search(String name) {
        for (var item:students) {
            if (item.getName().contains(name)) {
                return item;
            }
        }
        return null;
    }
}
