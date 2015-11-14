package com.jonibatista.playing.androiddatabinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jonibatista.playing.androiddatabinding.databinding.MainActivityBinding;
import com.jonibatista.playing.androiddatabinding.databinding.StaticViewActivityBinding;

public class StaticView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StaticViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.static_view_activity);
        User user = new User("Foo", "Bar");
        binding.setUser(user);
    }
}
