package modul3Praktikum;

/**
 *
 * @author genta
 */
public class Guru {
    private String nama;
    private int usia;
    
    //konstruktor
    public Guru(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
    //method
    public void infoGuru(){
        System.out.println("Nama Guru : "+nama);
        System.out.println("Usia Guru : "+usia);
    }
}
