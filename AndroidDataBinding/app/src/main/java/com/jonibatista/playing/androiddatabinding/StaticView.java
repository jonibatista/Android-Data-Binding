package com.jonibatista.playing.androiddatabinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.jonibatista.playing.androiddatabinding.databinding.StaticViewActivityBinding;

/**
 * A basic example that uses Android Data Binding library to display a POJO.
 *
 * For more information see the official documentation at http://developer.android.com/tools/data-binding/guide.html#data_object.
 */
public class StaticView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // binding a user to the UI
        StaticViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.static_view_activity);
        User user = new User("Foo", "Bar"); // Creating a new user to bound
        binding.setUser(user);
    }
}
