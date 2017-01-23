package com.learning.texnar13.canvasparabola;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new parDraw(this));
    }

    class parDraw extends View {

        Paint p;

        public parDraw(Context context) {
            super(context);
            p = new Paint();
        }

        @Override
        protected void onDraw(Canvas canvas) {

            Path path = new Path();

            //парабола
            p.setColor(Color.BLACK);
            p.setStyle(Paint.Style.FILL);
            path.reset();
            path.moveTo(130,2209);
            for (int i = -470; i < 480; i = i+10) {
                path.lineTo(i+600, (i/10)*(i/10));
            }
            canvas.drawPath(path, p);
            p.setTextSize(10);
            p.setColor(Color.WHITE);
            canvas.drawText("парабола. У вас очень хорошее зрение или разрешение устройства)",200,2100,p);
        }
    }

}
