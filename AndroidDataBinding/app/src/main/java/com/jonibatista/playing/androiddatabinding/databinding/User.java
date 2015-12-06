package com.jonibatista.playing.androiddatabinding.databinding;

/**
 * A immutable POJO that contains the user's first and last name.
 */
public class User {

    public final String firstName;
    public final String lastName;

    /**
     * Constructs a new user with its first and last name.
     *
     * @param firstName the user's first name.
     * @param lastName the user's last name.
     */
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
