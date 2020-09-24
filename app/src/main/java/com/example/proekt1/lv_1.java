package com.example.proekt1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class lv_1 extends AppCompatActivity {

    ImageView imageView;
    ConstraintLayout.LayoutParams params;
    int sw=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_1);

        imageView = findViewById(R.id.imagine);
        params = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
        );
        lvl(sw);
    }

    public void Next(View v) {
        sw++;
        lvl(sw);
    }

    public void Return(View v){
            sw--;
            lvl(sw);
    }

    private void lvl(int sw)
    {

        switch (sw)
        {
            case 1:
            {
                params.setMargins(20, 1140, 480, 310);
                imageView.setLayoutParams(params);

                int min = 1;
                int max = 5;
                int diff = max - min;
                Random random = new Random();
                int num1 = random.nextInt(diff + 1);
                num1 += min;
                int num2 = random.nextInt(diff + 1);
                num2 += min;

                TextView textView = findViewById(R.id.textView3);
                textView.setText(num1 + " + " + num2);
                break;
            }
            case 2:
            {
                params.setMargins(500, 540, 500, 460);
                imageView.setLayoutParams(params);


                int min = 1;
                int max = 5;
                int diff = max - min;
                Random random = new Random();
                int num1 = random.nextInt(diff + 1);
                num1 += min;
                int num2 = random.nextInt(diff + 1);
                num2 += min;

                TextView textView = findViewById(R.id.textView3);
                textView.setText(num1 + " + " + num2);
                break;
            }
            case 3:
            {
                params.setMargins(800, 200, 180, 570);
                imageView.setLayoutParams(params);


                int min = 3;
                int max = 7;
                int diff = max - min;
                Random random = new Random();
                int num1 = random.nextInt(diff + 1);
                num1 += min;
                int num2 = random.nextInt(diff + 1);
                num2 += min;

                TextView textView = findViewById(R.id.textView3);
                textView.setText(num1 + " + " + num2);
                break;
            }
            case 4:
            {
                params.setMargins(460, 270, 350, 1150);
               imageView.setLayoutParams(params);

                int min = 5;
                int max = 10;
                int diff = max - min;
                Random random = new Random();
                int num1 = random.nextInt(diff + 1);
                num1 += min;
                int num2 = random.nextInt(diff + 1);
                num2 += min;

                TextView textView = findViewById(R.id.textView3);
                textView.setText(num1 + " + " + num2);

                break;
            }
            case 5:
            {
                params.setMargins(150, 150, 650, 1300);
                imageView.setLayoutParams(params);


                int min = 7;
                int max = 15;
                int diff = max - min;
                Random random = new Random();
                int num1 = random.nextInt(diff + 1);
                num1 += min;
                int num2 = random.nextInt(diff + 1);
                num2 += min;

                TextView textView = findViewById(R.id.textView3);
                textView.setText(num1 + " + " + num2);
                break;
            }

            default:{
                sw = 1;
                params.setMargins(20, 1150, 480, 300);
                imageView.setLayoutParams(params);
            }
        }
    }

}