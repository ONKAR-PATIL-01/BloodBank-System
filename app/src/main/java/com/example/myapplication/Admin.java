package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Admin extends AppCompatActivity {
EditText et1,et2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        et1=findViewById(R.id.t1);
        et2=findViewById(R.id.t2);
        b=findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(et1.getText().toString().equals("onkar")&&et2.getText().toString().equals("p"))
{
    Intent i=new Intent(getApplicationContext(),admin_section.class);
    startActivity(i);
}
            }
        });
    }
}
