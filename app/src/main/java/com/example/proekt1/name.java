package com.example.proekt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
    }

    public void LV_1_Click(View v) {

        Intent lv1 =new Intent(name.this,lv_1.class);
                startActivity(lv1);
    }
    public void LV_2_Click(View v) {
        Intent lv2 =new Intent(name.this,lv_2.class);
        startActivity(lv2);
    }
    public void LV_3_Click(View v) {
        Intent lv3 = new Intent(name.this, lv_3.class);
        startActivity(lv3);
    }
}
