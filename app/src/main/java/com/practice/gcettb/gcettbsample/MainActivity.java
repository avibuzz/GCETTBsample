package com.practice.gcettb.gcettbsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("currentState","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("currentState","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("currentState","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("currentState","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("currentState","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("currentState","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("currentState","onDestroy");
    }
}
