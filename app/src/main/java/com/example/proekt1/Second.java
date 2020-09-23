package com.example.proekt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void HelloClick(View v) {
        EditText login_edit = findViewById(R.id.editTextLpgin);
        EditText pass_edit = findViewById(R.id.edittextPass);
            if (login_edit.getText().toString().equals("login")&&pass_edit.getText().toString().equals("pass")){
                Intent cfgmdfh=new Intent(Second.this,name.class);
                startActivity(cfgmdfh);
            }

    }
    }