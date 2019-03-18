package com.example.aishuqing.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activityexample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activityexample);
        Log.i("Main2examplelife","调用onCreate()");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Main2examplelife","调用onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Main2examplelife","调用onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Main2examplelife","调用onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Main2examplelife","调用onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Main2examplelife","调用onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Main2examplelife","调用onRestart");
    }

}
