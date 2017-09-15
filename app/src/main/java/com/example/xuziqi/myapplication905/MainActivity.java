package com.example.xuziqi.myapplication905;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyThread myThread = new MyThread();
        myThread.start();
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };
        thread.start();
    }
}
