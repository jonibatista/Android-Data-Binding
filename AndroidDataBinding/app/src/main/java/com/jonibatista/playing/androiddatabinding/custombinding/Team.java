package com.jonibatista.playing.androiddatabinding.custombinding;

import com.jonibatista.playing.androiddatabinding.custombinding.utils.BindableString;

/**
 * A custom binding using based on the @fabioCollini example.
 *
 * @see https://medium.com/@fabioCollini/android-data-binding-f9f9d3afc761#.36h3asngt
 */
public class Team {

    public final BindableString name = new BindableString();

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
