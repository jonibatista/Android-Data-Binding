package com.jonibatista.playing.androiddatabinding.custombinding.utils;

import java.util.Objects;

public class BindableString extends android.databinding.BaseObservable {
    String value;

    public String get() {
        return isEmpty() ? "" : value;
    }

    public void set(String value) {
        if (!Objects.equals(this.value, value)) {
            this.value = value;
            notifyChange();
        }
    }

    public boolean isEmpty() {
        return value == null || value.isEmpty();
    }
}