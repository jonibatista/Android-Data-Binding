package com.jonibatista.playing.androiddatabinding.custombinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.CustomBindingActivityBinding;

/**
 * A custom binding that creates generic tags to abstract setting a data property from a field.
 *
 * This example is based on the @fabioCollini post on medium.
 * @see https://medium.com/@fabioCollini/android-data-binding-f9f9d3afc761#.51uu8kigl
 */
public class TeamActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating and binding it
        CustomBindingActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.custom_binding_activity);
        binding.setTeam(new Team());

    }

}
