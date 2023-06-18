package Java;

public class Tabung extends Lingkaran{
    private double tinggi;

    public Tabung(){
        super();
        this.tinggi = 1.0;
        System.out.println("Constructed Tabung()");
    }
    public Tabung(double tinggi){
        super();
        this.tinggi = tinggi;
        System.out.println("Constructed Tinggi(tinggi)");
    }
    public Tabung(double tinggi, double jejari){
        super(jejari);
        this.tinggi = tinggi;
        System.out.println("Constructed Tabung(height, jejari)");
    }
    public Tabung(double tinggi, double jejari, String warna){
        super(jejari, warna);
        this.tinggi = tinggi;
        System.out.println("Constructed Tabung(tinggi,jejari,warna)");
    }
    public double getTinggi(){
        return this.tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getvolume(){
        return super.getArea()*tinggi;
    }
    
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()* height + 2*super.getArea();

    }
}
