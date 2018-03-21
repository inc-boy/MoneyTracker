package com.example.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Activity  создано");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"Activity становиться видимым");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity получает фокус");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity приостановлено");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity остановлено");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity уничтожено");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }
}
