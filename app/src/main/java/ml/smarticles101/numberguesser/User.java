package ml.smarticles101.numberguesser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import ml.smarticles101.numberguesser.R;
import java.util.Random;

public class User extends AppCompatActivity {
    EditText input;
    TextView status;
    int iteration;
    int computerGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        input = (EditText)findViewById(R.id.input);
        status = (TextView)findViewById(R.id.status);
		Intent i = getIntent();
        iteration = 0;
		int high=i.getIntExtra(ToComputer.MAX, 100);
		int low=i.getIntExtra(ToComputer.MIN, 0);
		Random rand = new Random();
        computerGuess = rand.nextInt((high-low)+1)+low;
    }

    public void submit(View view) {
        int userGuess = Integer.parseInt(String.valueOf(input.getText()).trim());
		input.setText("");
		iteration++;
        if(userGuess>computerGuess) {
            status.setText("Guess lower!");
        }

        if(userGuess<computerGuess) {
            status.setText("Guess higher!");
        }

        if(userGuess==computerGuess) {
            status.setText("You guessed correctly in "+ iteration +" guesses!");
        }
    }
}
