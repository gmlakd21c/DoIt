package com.example.com.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button openDialog;
    TextView textView;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openDialog = (Button)findViewById(R.id.openDialog);
        textView = (TextView)findViewById(R.id.textView);

        openDialog.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                AlertDialog alertDialog = createDialogBox();
                alertDialog.show();
            }

        });
    }

    public AlertDialog createDialogBox()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("안녕 나야");
        builder.setMessage("해봐 뭐든지");
       // builder.setIcon(R.drawable.alert_dialog_icon);

        builder.setPositiveButton("일번 !", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int whichButton)
            {
                text = "일번 버튼을 눌렀습니다." + Integer.toString(whichButton);
                textView.setText(text);
            }
        });

        builder.setNeutralButton("이번 !", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int whichButton)
            {
                text = "이번 버튼을 눌렀습니다." + Integer.toString(whichButton);
                textView.setText(text);
            }

        });


        builder.setNegativeButton("삼번 !", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int whichButton)
            {
                text = "삼번 버튼을 눌렀습니다." + Integer.toString(whichButton);
                textView.setText(text);
            }

        });

        AlertDialog dialog = builder.create();

        return dialog;
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
