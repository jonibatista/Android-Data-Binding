package com.jonibatista.playing.androiddatabinding.bidirectionaldatabinding;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.Objects;

/**
 * A bidirectional data binding using a TextWather based on the @fabioCollini example.
 *
 * @see https://medium.com/@fabioCollini/android-data-binding-f9f9d3afc761#.36h3asngt
 */
public class Team {

    /**
     * An observable field to notify its subscribers when the name of the team changes.
     */
    public final ObservableField<String> name = new ObservableField<>();

    /**
     * It watches for text changes when bound and sets the new value to the team's name
     * through its adapter.
     */
    public final TextWatcher watcher = new TextWatcherAdapter(){

        @Override
        public void afterTextChanged(Editable s) {
            // check if text has changed
            if (!Objects.equals(name.get(), s.toString())) {
                name.set(s.toString());
            }
        }
    };

    /**
     * Constructs a unknown Team.
     */
    public Team() {}

    /**
     * Constructs a new Team given its name.
     *
     * @param name the team's name.
     */
    public Team(String name){
        this.name.set(name);
    }
}
