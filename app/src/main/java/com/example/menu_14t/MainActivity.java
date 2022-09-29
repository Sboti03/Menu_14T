package com.example.menu_14t;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private EditText editTextInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    private void init() {
        btnSubmit = findViewById(R.id.btnSubmit);
        editTextInput = findViewById(R.id.editTextInput);
    }

}