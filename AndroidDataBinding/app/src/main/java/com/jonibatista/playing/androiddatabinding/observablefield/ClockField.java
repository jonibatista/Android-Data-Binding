package com.jonibatista.playing.androiddatabinding.observablefield;

import android.databinding.ObservableField;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * The observable field.
 *
 * A object that contains a time in a string format where the time can be modified.
 *
 * It's the observable object sample implemented with observable field.
 * @see com.jonibatista.playing.androiddatabinding.observableobject.ClockView
 */
public class ClockField {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public final ObservableField<String> time = new ObservableField<>();

    /**
     * Constructs a new clock with a initial time.
     *
     * @param calendar the calendar with the initial time.
     */
    public ClockField(Calendar calendar){
        time.set(dateFormat.format(calendar.getTime()));
    }

    /**
     * Updates the time to now.
     */
    public void updateTime(){
        time.set(dateFormat.format(Calendar.getInstance().getTime()));
    }
}
