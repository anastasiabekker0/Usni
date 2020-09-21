package com.example.proekt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void HelloClick(View v){
        EditText editText=findViewById(R.id.editTextTextName);
        TextView viewText=findViewById(R.id.textViewHello);
        viewText.setText("Привет, "+editText.getText());
    }

    public void name(View v){
   Intent intent=new Intent(MainActivity.this,Second.class);
   startActivity(intent);
    }

}
