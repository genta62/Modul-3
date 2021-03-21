package modul3Latihan2;
/**
 *
 * @author genta
 */
public class Employ extends Person {
    private String noKaryawan;
    
    //konstruktor
    public Employ(String noKaryawan, String nama, int usia){
        super(nama,usia);
        this.noKaryawan=noKaryawan;
        
    }
    
    //method
    public void info(){
        System.out.println("No.Karyawan :" +this.noKaryawan);
        super.info();
    }
}
