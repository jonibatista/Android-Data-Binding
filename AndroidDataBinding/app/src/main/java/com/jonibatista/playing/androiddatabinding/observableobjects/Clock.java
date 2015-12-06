package com.jonibatista.playing.androiddatabinding.observableobjects;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * The observable data object.
 *
 * A object that contains a time in a string format where the time can be modified.
 */
public class Clock extends BaseObservable {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private String time;

    /**
     * Constructs a new clock with a initial time.
     *
     * @param calendar the calendar with the initial time.
     */
    public Clock(Calendar calendar){
        this.time = dateFormat.format(calendar.getTime());
    }

    /**
     * Gets the time from the clock.
     *
     * @return the last set up time value.
     */
    @Bindable
    public String getTime() {
        return time;
    }

    /**
     * Sets a time.
     *
     * @param time value in string format.
     */
    public void setTime(String time) {
        this.time = time;

        // notifies listeners that time has change so they can get the new value.
        notifyPropertyChanged(com.jonibatista.playing.androiddatabinding.BR.time);
    }

    /**
     * Updates the time to now.
     */
    public void updateTime(){
        setTime(dateFormat.format(Calendar.getInstance().getTime()));
    }
}
