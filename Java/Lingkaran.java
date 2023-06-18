package Java;

public class Lingkaran {
    private double jejari;
    private String warna ;

    public Lingkaran() {
        this.jejari = 1.0;
        this.warna = "Merah";
        System.out.println("Constructed Lingkaran ()");
    }
    public Lingkaran(double jejari){
        this.jejari = jejari;
        this.warna = "Merah";
        System.out.println("Constructed Lingkaran(jejari)");
    }
    public Lingkaran(double jejari, String warna){
        this.jejari = jejari;
        this.warna = warna;
        System.out.println("Constructed Lingkaran(jejari, warna)");
    }
    public double getJejari() {
        return this.jejari;
    }
    public String getwarna() {
        return this.warna;
    }
    public void setRadius(double jejari){
        this.jejari = jejari;
    }
    public void setColor(String warna){
        this.warna = warna;
    }
    public String toString(){
        return "Lingkaran[jejari ="+ jejari +" + warna = "+ warna +"]";
    }
    public double getLuas(){
        return jejari * jejari * Math.PI;
    }
}
