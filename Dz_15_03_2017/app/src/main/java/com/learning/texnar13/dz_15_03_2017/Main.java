package com.learning.texnar13.dz_15_03_2017;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main extends AppCompatActivity implements View.OnClickListener {

    Button buttonAll;
    Button buttonName;
    Button buttonAge;
    TextView out;
    ArrayList persons = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        persons.add(new Person(10, "Maxim", "Maximov"));
        persons.add(new Person(15, "Natalya", "Petrova"));
        persons.add(new Person(21, "Olga", "Sidorova"));
        persons.add(new Person(70, "Sidor", "Sidorv"));
        persons.add(new Person(45, "Starik", "Hottabych"));


        buttonAll = (Button) findViewById(R.id.buttonAll);
        buttonName = (Button) findViewById(R.id.buttonName);
        buttonAge = (Button) findViewById(R.id.buttonDate);

        buttonAll.setOnClickListener(this);
        buttonName.setOnClickListener(this);
        buttonAge.setOnClickListener(this);

        out = (TextView) findViewById(R.id.out);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Iterator var3;
        out.setText("");
        switch (view.getId()) {
            case R.id.buttonAll:
                var3 = persons.iterator();
                while (var3.hasNext()) {
                    Person p = (Person) var3.next();
                    out.setText(out.getText() + "" + p + "\n");
                }
                break;
            case R.id.buttonName:
                Collections.sort(persons, Person.NAME_COMPARATOR);
                var3 = persons.iterator();
                while (var3.hasNext()) {
                    Person p = (Person) var3.next();
                    out.setText(out.getText() + "" + p + "\n");
                }
                break;
            case R.id.buttonDate:
                Collections.sort(persons, Person.AGE_COMPARATOR);
                var3 = persons.iterator();
                while (var3.hasNext()) {
                    Person p = (Person) var3.next();
                    out.setText(out.getText() + "" + p + "\n");
                }
                break;
        }
    }
}
