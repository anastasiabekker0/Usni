package com.example.proekt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class name extends AppCompatActivity {
int lvl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
    }

    public void Start(View view)
    {
        switch (lvl)
        {
            case 1:
            {
                Intent lv1 =new Intent(name.this,lv_1.class);
                startActivity(lv1);
                break;
            }
            case 2:
            {
                Intent lv2 =new Intent(name.this,lv_2.class);
                startActivity(lv2);
                break;
            }
            case 3:
            {
                Intent lv3 =new Intent(name.this,lv_3.class);
                startActivity(lv3);
                break;
            }
            default:
            {
                Toast.makeText(this, "Выберите уровень", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

    public void LV_1_Click(View v) {
        lvl=1;

    }
    public void LV_2_Click(View v) {
        lvl = 2;

    }
    public void LV_3_Click(View v) {
        lvl = 3;

    }
}
