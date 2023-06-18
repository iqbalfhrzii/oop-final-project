package Java.Tugas2;

public class Main {
    public static void main(String[] args) {
        // Buatlah objek pada program
        Person angger = new Person("Angger Karisma Deotama", "Kontrakan 12");
        Student MrBudi = new Student("Budi", "Jl. Manggar raya 30");
        Teacher MsDesi = new Teacher("Bu Desi susanti", "Pasar Segiri");


        // Penggunaan dalam kelas Person
        angger.setAddress("Kontrakan 12");
        System.out.println(angger.getName());;
        System.out.println(angger.getAddress());;
        System.out.println(angger.toString());;

        System.out.println();

        // Penggunaaan dalam kelas Student
        MrBudi.addCourseGrade("PBO",71);
        MrBudi.addCourseGrade("SisDig", 75);
        MrBudi.addCourseGrade("Kalkulus II", 86);
        MrBudi.printGrades();
        System.out.println(MrBudi.getAverageGrade());
        System.out.println(MrBudi.toString());

        System.out.println();

        // Penggunaan dalam kelas Teacher
        System.out.println(MsDesi.addCourse("PBO"));
        System.out.println(MsDesi.addCourse("Matdis"));
        System.out.println(MsDesi.addCourse("Matdis"));
        System.out.println(MsDesi.removeCourse("Kalkulus II"));
        System.out.println(MsDesi.removeCourse("Matdis"));
        System.out.println(MsDesi.toString());

    }
}
