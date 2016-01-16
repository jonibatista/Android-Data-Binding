package com.jonibatista.playing.androiddatabinding.bindingdata;

/**
 * A immutable POJO that represents a Team.
 */
public class Team {

    public final String name;

    /**
     * Constructs a new Team given its name.
     *
     * @param name the team's name.
     */
    public Team(String name){ this.name = name; }
}
