package modul3Latihan4;

/**
 *
 * @author genta
 */
public class DemoOverride2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.setA(62);
        obj.setB(105);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}
