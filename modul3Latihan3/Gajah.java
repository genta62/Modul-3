package modul3Latihan3;
/**
 *
 * @author genta
 */
public class Gajah extends Hewan {
    public static void testClassMethod(){
    System.out.println("The Class Method In Hewan... ");
    }
    //meng-override method pada kelas hewan
    public static void testInstanceMethod(){
        System.out.println("The Instance Method In Hewan...");
    }
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
    
}
