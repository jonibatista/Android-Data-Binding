package com.jonibatista.playing.androiddatabinding.observablefield;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.ClockFieldViewActivityBinding;

import java.util.Calendar;

/**
 * A basic example of an observable field that updates the time when you hit the update button.
 * The button has a click event bound to it that modifies the POJO which triggers the UI update.
 *
 * It's the observable object sample implemented with observable field.
 * @see com.jonibatista.playing.androiddatabinding.observableobject.Clock
 *
 * See the Data Objects section on the official documentation http://developer.android.com/tools/data-binding/guide.html#data_objects
 */
public class ClockFieldView extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating and binding it
        ClockFieldViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.clock_field_view_activity);
        binding.setClock(new ClockField(Calendar.getInstance()));
    }

}
