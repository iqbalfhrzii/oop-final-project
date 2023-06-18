
package Java.Tugas2;
// awali program dengan membuka class Person secara Public
public class Person {

protected String name, address;
// buatlah konstruktor kelas Person dengan menggunakan parameter name dan address.
    public Person(String name, String address) {
        // terapkan nilai variabel name & address dengan parameter name & address.
        this.name = name;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public String toString() {
        return "Person" + ",\n" +
                "   name = " + name + "\n" +
                "   address = " + address + "\n";
    }
}
