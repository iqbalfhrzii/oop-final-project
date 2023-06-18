package Java.book;

public class author {
    String Nama;
    String Email;
    char Gender;

    public author(String Nama, String Email, char Gender){
        
        this.Nama = Nama;
        this.Email = Email;
        this.Gender = Gender;
    }
    public String getNama() {
        return Nama;
    }
    public String getEmail() {
        return Email;

    }
    public char getGender() {
        return Gender;
    }

    public String toString() {
        return "author{" +
                "nama =" + Nama +'\'' +
                ", email='" + Email + '\'' +
                ", gender=" + Gender +
                '}';
    }
}
