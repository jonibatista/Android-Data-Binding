package com.jonibatista.playing.androiddatabinding.custombinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.app.Activity;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.CustomBindingActivityBinding;

public class CustomBindingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating and binding it
        CustomBindingActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.custom_binding_activity);
        binding.setCountry(new Country());

    }

}
