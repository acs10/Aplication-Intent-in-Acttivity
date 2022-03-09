package com.example.screenn;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(
                v -> startActivity(new Intent(this, MainActivity2.class))
        );



    }
}