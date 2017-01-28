package ru.pavlenty.canvasexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CanvasView customCanvas;
    private int color = 0;
    private int size = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCanvas = (CanvasView) findViewById(R.id.signature_canvas);

    }

    public void clearCanvas(View v) {
        customCanvas.clearCanvas();
    }

    public void setPaintColor(View v) {
        switch (color) {
            case 0:
                customCanvas.setPaintColor(Color.BLUE);
                v.setBackgroundColor(Color.BLUE);
                break;
            case 1:
                customCanvas.setPaintColor(Color.CYAN);
                v.setBackgroundColor(Color.CYAN);break;
            case 2:
                customCanvas.setPaintColor(Color.DKGRAY);
                v.setBackgroundColor(Color.DKGRAY);break;
            case 3:
                customCanvas.setPaintColor(Color.GRAY);
                v.setBackgroundColor(Color.GRAY);break;
            case 4:
                customCanvas.setPaintColor(Color.GREEN);
                v.setBackgroundColor(Color.GREEN);break;
            case 5:
                customCanvas.setPaintColor(Color.LTGRAY);
                v.setBackgroundColor(Color.LTGRAY);break;
            case 6:
                customCanvas.setPaintColor(Color.MAGENTA);
                v.setBackgroundColor(Color.MAGENTA);break;
            case 7:
                customCanvas.setPaintColor(Color.RED);
                v.setBackgroundColor(Color.RED);break;
            case 8:
                customCanvas.setPaintColor(Color.TRANSPARENT);
                v.setBackgroundColor(Color.TRANSPARENT);break;
            case 9:
                customCanvas.setPaintColor(Color.WHITE);
                v.setBackgroundColor(Color.WHITE);break;
            case 10:
                customCanvas.setPaintColor(Color.YELLOW);
                v.setBackgroundColor(Color.YELLOW);break;
            case 11:
                customCanvas.setPaintColor(Color.BLACK);
                v.setBackgroundColor(Color.BLACK);
                color = 0;
                break;
        }
        color++;

    }

    public void setPaintSize(View v) {
        if(!(size>25)){
        customCanvas.setPaintSize(size++);
        }else size = 0;
    }
}
