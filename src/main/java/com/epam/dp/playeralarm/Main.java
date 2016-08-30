package com.epam.dp.playeralarm;

/**
 * @author Ivan_Zhuravel
 */
public class Main {
    public static void main(String[] args) {
        PlayerImpl p = new PlayerImpl();
        Alarm a = new AlarmImpl();

        PlayerAlarm playerAlarm = new PlayerAlarm(p, a);

        playerAlarm.alarm();
        playerAlarm.play();

        PlayerAlarm playerAlarm2 = new PlayerAlarm(new IPod(), a);

        playerAlarm2.play();


    }
}
