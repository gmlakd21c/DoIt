package com.example.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    Button intentBtn;
    TextView textView1;
    public static final int REQUEST_CODE_NEW = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentBtn = (Button)findViewById(R.id.intentBtn);
        textView1 = (TextView)findViewById(R.id.textView1);
        intentBtn.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), NewActivity.class);
                startActivityForResult(intent, REQUEST_CODE_NEW);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_NEW)
        {
            Toast toast = Toast.makeText(getBaseContext(), "onAcitivityResult �޼ҵ尡 ȣ��� ��û�ڵ� : " + requestCode + ", ����ڵ� : " + resultCode, Toast.LENGTH_LONG);
            toast.show();

            if (resultCode == RESULT_OK)
            {
                String name = data.getExtras().getString("name");
                toast = Toast.makeText(getBaseContext(), "�������� ���޵� name : " + name, Toast.LENGTH_SHORT);
                toast.show();
            }
        }


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
