package Java;


public class Perpus {
    public Perpus(){
        System.out.println("\t" + "PERPUSTAKAAN DIGIDAW" + "\t" + "\n");
    }
    private String judulBuku, namaPengguna, tanggalPengembalian;
    public Perpus(String judulBuku){
        this.judulBuku = judulBuku;
    }
    
    public Perpus(String judulBuku, String namaPengguna){
        this.judulBuku = judulBuku;
        this.namaPengguna = namaPengguna;
    }

    public Perpus(String judulBuku, String namaPengguna, String tanggalPengembalian){
        this.judulBuku = judulBuku;
        this.namaPengguna = namaPengguna;
        this.tanggalPengembalian = tanggalPengembalian;
    }
    public void show(){
        System.out.println("Judul:" + this.judulBuku);
        System.out.println("Nama:" + this.namaPengguna);
        System.out.println("Tanggal Pengembalian:"+this.tanggalPengembalian + "\n");
        
        
    }
    
    
    public static void main(String[] args) {
            Perpus perpus1 = new Perpus(" Kancil yang durhaka", " Angger Karisma Deotama"," Selasa, 21 Agustus 2023");
            Perpus perpus2 = new Perpus(" Malin Kundang Pergi ke Blitar", " Wiranto", " Rabu, 22 Agustus 2023");
            Perpus perpus3 = new Perpus(" Legenda Sangkuriang", " Dion Prayoga", " Selasa, 21 Agustus 2023");
            
            perpus1.show();
            perpus2.show();
            perpus3.show();
            
        }
}
