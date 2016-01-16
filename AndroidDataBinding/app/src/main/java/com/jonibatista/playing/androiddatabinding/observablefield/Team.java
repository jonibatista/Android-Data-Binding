package com.jonibatista.playing.androiddatabinding.observablefield;

import android.databinding.ObservableField;

import com.jonibatista.playing.androiddatabinding.observableobject.TeamActivity;

/**
 * The observable field.
 *
 * Any plain old Java object (POJO) may be used for data binding, but modifying a POJO will not
 * cause the UI to update. The real power of data binding can be used by giving your data objects
 * the ability to notify when data changes.
 *
 * @see http://developer.android.com/tools/data-binding/guide.html#observablefields
 */
public class Team {

    /**
     * An observable field to notify its subscribers when the name of the team changes.
     */
    public final ObservableField<String> name = new ObservableField<>();

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
