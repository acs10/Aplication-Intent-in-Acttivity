package com.example.screenn;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MyBroadcastReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);


        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra("TELA", "Tela1");
        startService(intent);


        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(
                v -> startActivity(new Intent(this, MainActivity2.class))
        );

    }
    @Override
    protected void onStop() {
        super.onStop();
        receiver = new MyBroadcastReceiver();
        IntentFilter filter = new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION);
        registerReceiver(receiver, filter);
    }

    class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d("ESS", "WiFi mudou!");
        }
    }

}