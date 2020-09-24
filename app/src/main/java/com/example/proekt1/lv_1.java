package com.example.proekt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class lv_1 extends AppCompatActivity {

    ImageView imageView;
    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
            );
    int sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_1);

        imageView = findViewById(R.id.imagine);
        sw = 1;
    }

    public void Next(View v){
        sw++;
        lvl(sw);
    }

    private void lvl(int sw)
    {
        switch (sw)
        {
            case 1:
            {
                params.setMargins(90, 220, 0, 0);
                break;
            }
            case 2:
            {
                break;
            }
        }
        imageView.setLayoutParams(params);
    }
}