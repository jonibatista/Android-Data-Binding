package com.jonibatista.playing.androiddatabinding.custombinding.utils;

public class BindableBoolean extends BaseObservable {
    boolean mValue;

    public boolean get() {
        return mValue;
    }

    public void set(boolean value) {
        if (mValue != value) {
            this.mValue = value;
            notifyChange();
        }
    }
}