package com.jonibatista.playing.androiddatabinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.jonibatista.playing.androiddatabinding.databinding.ClockViewActivityBinding;

import java.util.Calendar;

/**
 * Created by jbatista on 14/11/15.
 */
public class ClockView extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ClockViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.clock_view_activity);
        binding.setClock(new Clock(Calendar.getInstance()));
    }
}
