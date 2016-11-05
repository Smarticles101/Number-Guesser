package ml.smarticles101.numberguesser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ml.smarticles101.numberguesser.R;

public class Computer extends AppCompatActivity {
    int currentGuess;
    int iteration;
    TextView status;
    int high;
    int low;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        status = (TextView)findViewById(R.id.status);
        currentGuess = 0;
        iteration = 0;
		high=100;
		low=0;
        makeGuess(50);
    }

    public void lower(View view) {
        high = currentGuess-1;
        makeGuess((low+high)/2);
    }

    public void correct(View view) {
        status.setText("I guessed right in " + iteration + " guesses!");
    }

    public void higher(View view) {
        low = currentGuess+1;
        makeGuess((low+high)/2);
    }

    public void makeGuess(int guess) {
        currentGuess = guess;
        status.setText("I guess " + guess + "!");
        iteration++;
    }
}
