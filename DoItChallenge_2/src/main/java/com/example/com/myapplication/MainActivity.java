package com.example.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends Activity {

    EditText editText;
    Button sendBtn, cancelBtn;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        sendBtn = (Button)findViewById(R.id.sendBtn);
        cancelBtn = (Button)findViewById(R.id.cancelBtn);
        textView = (TextView)findViewById(R.id.textView);

        editText.addTextChangedListener(new TextWatcher()
        {
                                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                            }
                                            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3){

                                            }
                                            public void afterTextChanged(Editable editable) {
                                                textView.setText(editText.getText().length() + " / 80 바이트");
                                            }
        });


        //textView.setText(editText.getText().length() + " / 80 바이트");
        sendBtn.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                String context;
                context = editText.getText().toString();
                Toast.makeText(getApplicationContext(), context, Toast.LENGTH_SHORT).show();
                editText.setText("");
            }

        });

        cancelBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "SMS종료합니다", Toast.LENGTH_SHORT).show();
                finish();
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
