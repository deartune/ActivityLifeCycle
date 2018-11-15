package com.example.edu.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Log.e(this.getClass().getName(),"OnCreat실행");
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    protected void onRestart() {
        super.onRestart();
        Log.e(this.getClass().getName(), "OnReStart실행");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(this.getClass().getName(), "OnStart실행");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(this.getClass().getName(), "OnResume실행");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(this.getClass().getName(), "OnPause실행");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(this.getClass().getName(), "OnStop실행");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(this.getClass().getName(), "OnDestroy실행");
    }
}