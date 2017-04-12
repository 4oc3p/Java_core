package homework.interfaces.third;

/**
 * Created by 4oc3p on 13.04.2017. Java_core
 */
public class Raft extends Boat {
    public Raft(int maxSpeed, int displacement, String name, int maxPassengers) {
        super(maxSpeed, displacement, name, maxPassengers);
    }

    @Override
    public void printDisplacement() {
        System.out.println(super.getDisplacement());
    }


}
