package modul3Latihan5;

/**
 *
 * @author genta
 */
public class MountainTruck extends Truck {
    //The MountainTruck subclass adds one fields
    public int seatHeight;
    
    //The MountainTruck subclas has one constructor
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight=startHeight;
    }
    //The MountainTruck subclass adds one method
    public void setHeight(int newValue){
        seatHeight=newValue;
    }
    public static void main(String[] args) {
        System.out.println("Mulai berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear  : "+MB.gear);
        System.out.println("Speed : "+MB.speed);
        MB.setGear(2);
        MB.speedup(2);
        System.out.println("gear  : "+MB.gear);
        System.out.println("Speed : "+MB.speed);
        MB.speedup(2);
        System.out.println("gear  : "+MB.gear);
        System.out.println("Speed : "+MB.speed);
    }
}
