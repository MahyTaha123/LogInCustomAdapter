package com.example.maha.logincustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class second_activity extends AppCompatActivity {
    TextView textView2;
    EditText note;
    Button add;
    ListView list;
    ArrayList<String> data;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        textView2 = (TextView) findViewById(R.id.textView2);

        String name = (String) getIntent().getExtras().get("UserName");
        textView2.setText(name);

    }
}
