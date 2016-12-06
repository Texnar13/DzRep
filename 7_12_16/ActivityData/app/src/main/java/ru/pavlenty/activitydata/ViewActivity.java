package ru.pavlenty.activitydata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        recView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String firstname = intent.getStringExtra("fname");
        String lastname = intent.getStringExtra("lname");

        recView.setText("Your name is: " + firstname + " " + lastname);


        //MyCode
        Button buttonExit = (Button) findViewById(R.id.end_b);
        Button buttonKill = (Button) findViewById(R.id.kill_b);

        buttonKill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onStop();
            }
        });
    }
}
