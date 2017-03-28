package homework.alarm;

/**
 * Created by 4oc3p on 28.03.2017. Java_core
 */
public class AlarmClockTest {
    public static void main(String[] args) throws InterruptedException {
        AlarmClock alarmClock = new AlarmClock(EnumMelody.MELODY_1, EnumVolume.LOW, 18, 19);
//        alarmClock.setActivated(true);
        alarmClock.alarmRing();
        System.out.println(alarmClock);
    }
}
