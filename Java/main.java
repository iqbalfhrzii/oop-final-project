package Java;

public class main {
    public static void main(String[] args){
        Tabung tabungKecil = new Tabung(2,4);
        System.out.println("jejari :" + tabungKecil.getJejari()
        +", Tinggi :"+ tabungKecil.getTinggi()
        + ", Warna :" + tabungKecil.getwarna()
        + ", Luas: " + tabungKecil.getLuas()
        + ", Volume :" + tabungKecil.getvolume());

        Tabung tabungBesar = new Tabung (10,20);
        System.out.println("jejari :" + tabungBesar.getJejari()
        +", Tinggi :"+ tabungBesar.getTinggi()
        + ", Warna :" + tabungBesar.getwarna()
        + ", Luas: " + tabungBesar.getLuas()
        + ", Volume :" + tabungBesar.getvolume());
    }
        
}
        
       