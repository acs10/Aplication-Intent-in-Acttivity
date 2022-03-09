package com.example.screenn;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra("TELA", "Tela3");
        startService(intent);
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(
                v -> startActivity(new Intent(this, MainActivity.class))

        );
    }
}