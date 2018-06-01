package pl.nataliana.mylibrary;

import android.view.View;
import android.widget.Toast;

public class JokeBase {

    public void tellJoke(View view) {
        Toast.makeText(this, MainActivity.joke1, Toast.LENGTH_SHORT).show();
    }
}
