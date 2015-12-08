package com.jonibatista.playing.androiddatabinding.bidirectionaldatabinding;

/**
 * TODO
 */
public class Team {

    private String name;

    /**
     * Constructs a new team.
     */
    public Team(){}

    /**
     * Constructs a new team.
     *
     * @param name the name of the team.
     */
    public Team(String name){
        this.setName(name);
    }

    /**
     * Gets the name of the team.
     *
     * @return the name of the team
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the team.
     *
     * @param name the name of the team
     */
    public void setName(String name) {
        this.name = name;
    }
}
