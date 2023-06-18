// Gunakan package untuk dapat mengakses folder Tugas2 pada folder utama (Java)
package Java.Tugas2;

// mengimport class ArrayList dari package java.util.
import java.util.ArrayList;


public class Teacher extends Person {

    
    protected ArrayList<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        courses = new ArrayList<>();
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        }
        courses.add(course);
        return true;
    }

    public boolean removeCourse(String course) {
        if (!courses.contains(course)) {
            return false;
        }
        courses.remove(course);
        return true;
    }

    // override method "toString" dari superclass Person
    @Override
    public String toString() {
        return "Teacher{" + ",\n" +
                "   name='" + name + ",\n" +
                "   address='" + address + ",\n" +
                "   courses=" + courses + ",\n" +
                '}';
    }
}
