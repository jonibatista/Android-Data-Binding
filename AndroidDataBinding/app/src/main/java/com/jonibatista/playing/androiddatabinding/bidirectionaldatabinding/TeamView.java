package com.jonibatista.playing.androiddatabinding.bidirectionaldatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.app.Activity;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.TeamViewActivityBinding;

public class TeamView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating and binding it
        TeamViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.team_view_activity);
        binding.setTeam(new Team());
    }

}
