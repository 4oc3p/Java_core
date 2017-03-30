package homework.alarm;

import org.joda.time.LocalDateTime;

import java.util.Scanner;

/**
 * Created by 4oc3p on 28.03.2017. Java_core
 */
public class AlarmClock {
    private boolean isActivated;
    private EnumMelody alarmMelody;
    private EnumVolume alarmVolume;
    private int alarmHours;
    private int alarmMinutes;

    public AlarmClock(EnumMelody alarmMelody, EnumVolume alarmVolume, int alarmHours, int alarmMinutes) {
        this.alarmMelody = alarmMelody;
        this.alarmVolume = alarmVolume;
        this.alarmHours = alarmHours;
        this.alarmMinutes = alarmMinutes;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public EnumMelody getAlarmMelody() {
        return alarmMelody;
    }

    public void setAlarmMelody(EnumMelody alarmMelody) {
        this.alarmMelody = alarmMelody;
    }

    public EnumVolume getAlarmVolume() {
        return alarmVolume;
    }

    public void setAlarmVolume(EnumVolume alarmVolume) {
        this.alarmVolume = alarmVolume;
    }

    public int getAlarmHours() {
        return alarmHours;
    }

    public void setAlarmHours(int alarmHours) {
        this.alarmHours = alarmHours;
    }

    public int getAlarmMinutes() {
        return alarmMinutes;
    }

    public void setAlarmMinutes(int alarmMinutes) {
        this.alarmMinutes = alarmMinutes;
    }

    @Override
    public String toString() {
        return "AlarmClock{" +
                "isActivated=" + isActivated +
                ", alarmMelody=" + alarmMelody +
                ", alarmVolume=" + alarmVolume +
                ", alarmTime=" + alarmHours +
                ":" + alarmMinutes +
                '}';
    }

    public void alarmRing() throws InterruptedException {
        LocalDateTime time;
        int hour, minutes, seconds;
        while (true) {
            time = LocalDateTime.now();
            hour = time.getHourOfDay();
            minutes = time.getMinuteOfHour();
            seconds = time.getSecondOfMinute();
            if (this.isActivated) {
                alarmIsActivated(hour, minutes, seconds);
            } else {
                alarmIsNotActivated();
            }
        }
    }

    private void buzzAlarm(EnumMelody melody, EnumVolume volume) {
        System.out.printf("Alarm is ringing with melody => %s and volume => %s\n", melody, volume);
    }

    private void alarmIsActivated(int hour, int minutes, int seconds) throws InterruptedException {
        if (hour == this.alarmHours && minutes == this.alarmMinutes) {
            buzzAlarm(this.alarmMelody, this.alarmVolume);
            System.exit(0);
        } else {
            System.out.println(hour + ":" + minutes + ":" + (seconds < 10 ? "0" : "") + seconds);
            Thread.sleep(1000);
        }
    }

    private void alarmIsNotActivated() {
        System.out.println("Alarm activated:" + this.isActivated + "\nDo you want to activate? Enter 'y' if yes");
        Scanner scanner = new Scanner(System.in);
        this.isActivated = scanner.nextLine().toLowerCase().equals("y");
        if (this.isActivated) {
            System.out.println("hours");
            this.alarmHours = scanner.nextInt();
            System.out.println("minutes");
            this.alarmMinutes = scanner.nextInt();
        } else {
            System.out.println("Alarm deactivated, bye.");
            System.exit(0);
        }
    }

}
