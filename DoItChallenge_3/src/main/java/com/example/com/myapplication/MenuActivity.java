package com.example.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MenuActivity extends Activity {


    Button customerManage, saleManage, productManage, logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        customerManage = (Button)findViewById(R.id.customerManage);
        saleManage = (Button)findViewById(R.id.saleManage);
        productManage = (Button)findViewById(R.id.productManage);
        logOut = (Button)findViewById(R.id.logOut);


        customerManage.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "°í°´°ü¸®", Toast.LENGTH_SHORT).show();
                Intent customerIntent = new Intent(getBaseContext(), CustomerMangeActivity.class);
                startActivityForResult(customerIntent, 3);
            }
        });

        logOut.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
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
