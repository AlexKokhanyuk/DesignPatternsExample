package com.epam.dp.playeralarm;

/**
 * @author Ivan_Zhuravel
 */
public class PlayerAlarm implements Alarm, Player {

    private final Player player;
    private final Alarm alarm;

    public PlayerAlarm(Player player, Alarm alarm) {
        this.player = player;
        this.alarm = alarm;
    }

    @Override
    public void alarm() {
        alarm.alarm();
    }

    @Override
    public void play() {
        player.play();
    }
}
