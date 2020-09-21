package com.example.proekt1;

import androidx.appcompat.app.AppCompatActivity;

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

    public void HelloClick(View v) {
        EditText editText = findViewById(R.id.editTextTextName);
        TextView viewText = findViewById(R.id.textViewHello);
        viewText.setText("Привет, " + editText.getText());
    }
}
