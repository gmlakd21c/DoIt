package com.example.com.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.zip.Inflater;

public class MainActivity extends Activity {


    Button addInflater;
    LinearLayout inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addInflater = (Button)findViewById(R.id.addInflater);

        addInflater.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                addInflater();
            }
        });

    }

    public void addInflater()
    {
        LinearLayout addLayout = (LinearLayout)findViewById(R.id.inflater);
        LayoutInflater LayoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        LayoutInflater.inflate(R.layout.button, addLayout, true);

        Button btn = (Button)findViewById(R.id.button);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
