package com.jonibatista.playing.androiddatabinding.observableobject;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.jonibatista.playing.androiddatabinding.R;
import com.jonibatista.playing.androiddatabinding.databinding.ObservableObjectActivityBinding;

/**
 * A basic example that uses observable object to display a Team in the UI.
 */
public class TeamActivity extends Activity{

    // The observable object bound to the UI
    private Team team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating and binding it
        ObservableObjectActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.observable_object_activity);
        team = new Team();
        binding.setTeam(team);
    }

    /**
     * Updates the team's name given the text in the edit text field.
     * @param view
     */
    public void onClickOo(View view) {
        EditText et = (EditText) findViewById(R.id.teamNameOoEt);
        team.setName(et.getText().toString());
    }

}
