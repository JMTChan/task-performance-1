package com.example.pc002.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void blogpost(View view)
    {
        EditText zxc = (EditText) findViewById(R.id.titlezxc);
        String a = zxc.getText().toString();
        EditText zxcc = (EditText) findViewById(R.id.blog);
        String b = zxcc.getText().toString();

        Log.d("MainActivity","Title: "+ a);
        Log.d("MainActivity","Blog: "+ b);
    }
}
