package com.jonibatista.playing.androiddatabinding.bindingdata;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.BindingDataActivityBinding;

/**
 * A basic example that uses Android Data Binding library to display a POJO.
 *
 * For more information see the official documentation at http://developer.android.com/tools/data-binding/guide.html#data_object.
 */
public class TeamActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // binding a user to the UI
        BindingDataActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.binding_data_activity);
        Team team = new Team("S. L. Benfica"); // Creating a new Team to bound
        binding.setTeam(team);
    }
}
