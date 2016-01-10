package com.jonibatista.playing.androiddatabinding.bidirectionaldatabinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.TeamViewActivityBinding;


/**
 * This is a basic example of data binding from UI to model using a text field.
 *
 * This example is based on the @fabioCollini post on medium
 * @see https://medium.com/@fabioCollini/android-data-binding-f9f9d3afc761#.51uu8kigl
 */
public class TeamView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating and binding it
        TeamViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.team_view_activity);
        binding.setTeam(new Team());
    }

}
