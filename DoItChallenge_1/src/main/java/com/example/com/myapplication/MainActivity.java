package com.example.com.myapplication;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.view.View.OnClickListener;



public class MainActivity extends Activity {

    ScrollView scrollView1, scrollView2;
    ImageView image1, image2;
    Button upBtn, downBtn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView1 = (ScrollView)findViewById(R.id.scrollView1);
        scrollView2 = (ScrollView)findViewById(R.id.scrollView2);
        upBtn = (Button)findViewById(R.id.upBtn);
        downBtn = (Button)findViewById(R.id.downBtn);
        image1 = (ImageView)findViewById(R.id.image1);
        image2 = (ImageView)findViewById(R.id.image2);

        scrollView1.setHorizontalScrollBarEnabled(true);
        scrollView2.setHorizontalScrollBarEnabled(true);
        scrollView1.setVerticalScrollBarEnabled(true);
        scrollView2.setVerticalScrollBarEnabled(true);

        Resources res = getResources();
        BitmapDrawable bitmap = (BitmapDrawable)res.getDrawable(R.drawable.gogo);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();


        image1.setImageDrawable(bitmap);
        image1.getLayoutParams().width = bitmapWidth;
        image1.getLayoutParams().height = bitmapHeight;

        image2.setImageDrawable(bitmap);
        image2.getLayoutParams().width = bitmapWidth;
        image2.getLayoutParams().height = bitmapHeight;

        upBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
            }
        });

        downBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
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
