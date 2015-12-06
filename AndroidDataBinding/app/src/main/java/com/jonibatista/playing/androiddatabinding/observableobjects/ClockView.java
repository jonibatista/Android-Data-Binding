package com.jonibatista.playing.androiddatabinding.observableobjects;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.ClockViewActivityBinding;

import java.util.Calendar;

/**
 * A basic example of an observable object that updates the time when you hit the update button.
 * The button has a click event bound to it that modifies the POJO which triggers the UI update.
 *
 * See the Data Objects section on the official documentation
 * http://developer.android.com/tools/data-binding/guide.html#data_objects
 */
public class ClockView extends Activity{

    // The data object bound to the UI
    private final Clock clock = new Clock(Calendar.getInstance());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating and binding it
        ClockViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.clock_view_activity);
        clock.updateTime(); // updates the time to be sync when it's displayed
        binding.setClock(clock);
    }

    /**
     * Updates the clock time which notifies its listeners - UI in this example.
     * @param view
     */
    public void onClickUpdateClock(View view) {
        clock.updateTime();
    }

}
