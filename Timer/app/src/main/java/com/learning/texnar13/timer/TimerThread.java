package com.learning.texnar13.timer;


import android.util.Log;
import android.widget.Toast;

public class TimerThread implements Runnable{

    @Override
    public void run() {
        Log.i("MY","time_thread_start");
        while(ScreenTimeActivityMainActivity.is) {
            System.err.print("O no");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ScreenTimeActivityMainActivity.myTime++;
            ScreenTimeActivityMainActivity.timeOut.setText("hello");

        }
    }
}
