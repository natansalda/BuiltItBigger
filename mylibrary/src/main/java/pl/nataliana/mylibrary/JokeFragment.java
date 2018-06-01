package pl.nataliana.mylibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokeFragment extends Fragment {

    private String myJokeString;
    private TextView myJokeTV;

    public JokeFragment() {
    }

    public static JokeFragment newInstance(String jokeKey) {
        JokeFragment fragment = new JokeFragment();
        Bundle args = new Bundle();
        args.putString(JokeBase.JOKE_KEY, jokeKey);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            myJokeString = getArguments().getString(JokeBase.JOKE_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        myJokeTV = view.findViewById(R.id.tv_myjoke);
        myJokeTV.setText(myJokeString);
        return view;
    }
}
