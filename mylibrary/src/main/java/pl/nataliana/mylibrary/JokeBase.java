package pl.nataliana.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//This is my android library
public class JokeBase extends AppCompatActivity {

    public static String JOKE_KEY = "joke-key";

    private String jokeFromLib = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getStringExtra(JokeBase.JOKE_KEY) != null) {
            jokeFromLib = getIntent().getStringExtra(JokeBase.JOKE_KEY);
        }

        getSupportFragmentManager()
                .beginTransaction().add(
                R.id.joke_fragment,
                JokeFragment.newInstance(jokeFromLib))
                .commit();
    }
}
