package com.jonibatista.playing.androiddatabinding.bidirectionaldatabinding;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.Objects;

/**
 * The implementation of a TextWatcher to watch the bound object.
 */
public class TextWatcherAdapter implements TextWatcher{

    private final ObservableField<String> text;

    /**
     * Constructs a TextWatcher bound to a editable field.
     *
     * @param text The ObservableField where the watched value is set.
     */
    public TextWatcherAdapter(ObservableField<String> text){
        this.text = text;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        // check if text has changed
        if (!Objects.equals(text.get(), s.toString())) {
            text.set(s.toString());
        }
    }
}
