package com.example.screenn;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(
                v -> startActivity(new Intent(this, MainActivity3.class))

        );
    }
}