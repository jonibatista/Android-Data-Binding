package com.jonibatista.playing.androiddatabinding.custombinding.utils;

public class BindableString extends android.databinding.BaseObservable {
    String value;

    public String get() {
        return value != null ? value : "";
    }

    public void set(String value) {
        if (!this.value.equals(value)) {
            this.value = value;
            notifyChange();
        }
    }

    public boolean isEmpty() {
        return value == null || value.isEmpty();
    }
}