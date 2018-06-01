package pl.nataliana.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

//This is my android library
public class JokeBase extends AppCompatActivity {

    public static String JOKE_KEY = "joke-key";
    private TextView myJokeTV;
    private String jokeFromLib = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_main);

        if (getIntent().getStringExtra(JokeBase.JOKE_KEY) != null) {
            jokeFromLib = getIntent().getStringExtra(JokeBase.JOKE_KEY);
        }
        myJokeTV = findViewById(R.id.tv_myjoke);
        myJokeTV.setText(jokeFromLib);
    }
}
