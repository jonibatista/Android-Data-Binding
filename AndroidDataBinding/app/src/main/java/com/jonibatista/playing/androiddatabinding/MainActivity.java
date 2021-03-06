package com.jonibatista.playing.androiddatabinding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jonibatista.playing.androiddatabinding.custombinding.TeamActivity;

public class MainActivity extends Activity {

    private ListView menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        menu = (ListView) findViewById(R.id.lvMenu);
        menu.setOnItemClickListener(itemClickListener);
    }

    private AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            System.out.println(position);
            switch (position){
                case 0:
                    startActivity( new Intent(getApplicationContext(), com.jonibatista.playing.androiddatabinding.bindingdata.TeamActivity.class) );
                    break;
                case 1:
                    startActivity( new Intent(getApplicationContext(), com.jonibatista.playing.androiddatabinding.observableobject.TeamActivity.class) );
                    break;
                case 2:
                    startActivity( new Intent(getApplicationContext(), com.jonibatista.playing.androiddatabinding.observablefield.TeamActivity.class) );
                    break;
                case 3:
                    startActivity( new Intent(getApplicationContext(), com.jonibatista.playing.androiddatabinding.bidirectionaldatabinding.TeamActivity.class) );
                    break;
                case 4:
                    startActivity( new Intent(getApplicationContext(), TeamActivity.class) );
                    break;
            }
        }
    };
}
