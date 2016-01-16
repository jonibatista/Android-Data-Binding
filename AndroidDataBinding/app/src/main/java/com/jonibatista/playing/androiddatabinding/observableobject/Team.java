package com.jonibatista.playing.androiddatabinding.observableobject;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jonibatista.playing.androiddatabinding.BR;

/**
 * The observable object.
 *
 * Any plain old Java object (POJO) may be used for data binding, but modifying a POJO will not
 * cause the UI to update. The real power of data binding can be used by giving your data objects
 * the ability to notify when data changes.
 *
 * @see http://developer.android.com/tools/data-binding/guide.html#observable_objects
 */
public class Team extends BaseObservable {

    private String name;

    /**
     * Constructs a unknown Team.
     */
    public Team() { this.name = ""; }

    /**
     * Constructs a new Team given its name.
     *
     * @param name the team's name.
     */
    public Team(String name){
        this.name = name;
    }

    /**
     * Gets the name of the team.
     *
     * @return the team's name.
     */
    @Bindable
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the team.
     *
     * @param name the team's name.
     */
    public void setName(String name) {
        this.name = name;

        // notifies listeners that team's name has changed so they can get the new value.
        notifyPropertyChanged(BR.name);
    }
}
