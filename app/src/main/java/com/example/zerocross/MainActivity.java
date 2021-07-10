package com.example.zerocross;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editfirst, editsecond;
    Button add;
    pref p;
    String data = "hello";
    String data1 = "hello1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editfirst = (EditText) findViewById(R.id.editfirst);
        editsecond = (EditText) findViewById(R.id.editsecond);
        add = (Button) findViewById(R.id.Add);

        add.setOnClickListener

                (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(editfirst.getText())) {
                    editfirst.setError("FirstPlayer is required");
                } else if (TextUtils.isEmpty(editsecond.getText())) {
                    editsecond.setError("SecondPlayer is required");
                } else {
                    Save();
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
                }
            }
        });
    }

    public void Save() {
        p = new pref(this);
        String firstplayer = editfirst.getText().toString();
        String secondplayer = editsecond.getText().toString();
        p.setkeyvalue(data, firstplayer);
        p.setkeyvalue(data1, secondplayer);
    }
    }

