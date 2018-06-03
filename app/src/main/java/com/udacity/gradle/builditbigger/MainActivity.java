package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import pl.nataliana.lib100.JokeTellingClass;
import pl.nataliana.mylibrary.JokeBase;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        new EndpointAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        new EndpointAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
//        JokeTellingClass jokeTeller = new JokeTellingClass();
//        Intent intent = new Intent(this, JokeBase.class);
//        intent.putExtra(JokeBase.JOKE_KEY, jokeTeller.getJoke());
//        startActivity(intent);
    }
}
