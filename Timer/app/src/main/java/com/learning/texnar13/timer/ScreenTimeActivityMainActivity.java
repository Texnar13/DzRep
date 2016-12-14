package com.learning.texnar13.timer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScreenTimeActivityMainActivity extends AppCompatActivity implements View.OnClickListener {

    static TextView timeOut;
    Button start;
    Button pause;
    Button stop;
    static boolean is = false;
    static int myTime = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_time_activity_main);
        timeOut = (TextView) findViewById(R.id.timerOut);
        start = (Button) findViewById(R.id.buttonS);
        pause = (Button) findViewById(R.id.buttonP);
        stop = (Button) findViewById(R.id.buttonSt);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        pause.setOnClickListener(this);


        Thread thread = new Thread(new TimerThread());
        thread.start();



    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.buttonS:
                is = true;
                Log.i("MY","pressed_start");
            break;
            case R.id.buttonSt:
                is = false;
                Log.i("MY","pressed_stop");
                myTime = 0;
                break;
            case R.id.buttonP:
                is = false;
                Log.i("MY","pressed_pause");
                break;
        }
    }
}
