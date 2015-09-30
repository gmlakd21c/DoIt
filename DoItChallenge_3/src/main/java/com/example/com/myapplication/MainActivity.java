package com.example.com.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends Activity {


    Button logIn;
    EditText id,pw;
    LinearLayout inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logIn = (Button)findViewById(R.id.logIn);
        id = (EditText)findViewById(R.id.id);
        pw = (EditText)findViewById(R.id.pw);

        logIn.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                String textId,textPw;

                textId = id.getText().toString();
                textPw = pw.getText().toString();

                if(textId.length() != 0 && textPw.length() != 0)
                {
                    Intent menuIntent = new Intent(getBaseContext(), MenuActivity.class);
                    startActivityForResult(menuIntent, 2);

                }

                else
                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 입력해주세요.", Toast.LENGTH_LONG).show();

            }
        });
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
