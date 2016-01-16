package com.jonibatista.playing.androiddatabinding.observablefield;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.ObservableFieldActivityBinding;

/**
 * A basic example that uses observable field to display a Team in the UI.
 */
public class TeamActivity extends Activity{

    private Team team;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating and binding it
        ObservableFieldActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.observable_field_activity);
        team = new Team();
        binding.setTeam(team);
    }

    /**
     * Updates the team's name given the text in the edit text field.
     * @param view
     */
    public void onClickOf(View view) {
        EditText et = (EditText) findViewById(R.id.teamNameOfEt);
        team.name.set(et.getText().toString());
    }

}
