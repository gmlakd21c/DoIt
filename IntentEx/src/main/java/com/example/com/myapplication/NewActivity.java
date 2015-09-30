package com.example.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NewActivity extends Activity {

    EditText editText;
    Button backBtn,callBtn;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        backBtn = (Button)findViewById(R.id.backBtn);
        callBtn = (Button)findViewById(R.id.callBtn);
        editText = (EditText)findViewById(R.id.editText);
        textView2 = (TextView)findViewById(R.id.textView2);

        backBtn.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Intent backIntent = new Intent();
                backIntent.putExtra("name", "гоебаь");
                setResult(1, backIntent);
                finish();
            }
        });

        callBtn.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                String callNum = editText.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(callNum));
                startActivity(callIntent);



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
