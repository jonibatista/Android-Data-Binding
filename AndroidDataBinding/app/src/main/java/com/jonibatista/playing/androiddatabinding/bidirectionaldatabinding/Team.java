package com.jonibatista.playing.androiddatabinding.bidirectionaldatabinding;

import android.databinding.ObservableField;
import android.text.TextWatcher;

/**
 * A Team is represented by its name and it has a text field with bidirectional data binding.
 *
 * @see https://medium.com/@fabioCollini/android-data-binding-f9f9d3afc761#.36h3asngt
 */
public class Team {

    /**
     * An observable to notify its subscribers when the name of the team changes.
     */
    public final ObservableField<String> name = new ObservableField<>();

    /**
     * It watches for text changes when bound and sets the new value to the team's name
     * through its adapter.
     */
    public final TextWatcher watcher = new TextWatcherAdapter(name);


}
