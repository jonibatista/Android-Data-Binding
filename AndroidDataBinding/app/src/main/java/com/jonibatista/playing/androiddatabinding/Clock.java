package com.jonibatista.playing.androiddatabinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * Created by jbatista on 14/11/15.
 */
public class Clock {

    private String time;

    public Clock(Calendar calendar){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        this.time = sdf.format(calendar.getTime());
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
