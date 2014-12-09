package com.example.multunus.testapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList forecast = new ArrayList<String>();
        forecast.add("Today - 21");
        forecast.add("Tomorrow - 22");
        forecast.add("Thursday - 23");
        forecast.add("Friday - 24");
        forecast.add("Saturday - 25");
        forecast.add("Sunday - 26");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item, R.id.listViewTextItem, forecast);
        ListView listView = (ListView) this.findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
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
        return super.onOptionsItemSelected(item);
    }
}
