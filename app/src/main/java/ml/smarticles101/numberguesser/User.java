package ml.smarticles101.numberguesser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import ml.smarticles101.numberguesser.R;

public class User extends AppCompatActivity {
    EditText input;
    TextView status;
    int iteration;
    int computerGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        input = (EditText)findViewById(R.id.input);
        status = (TextView)findViewById(R.id.status);
        iteration = 0;
        computerGuess = (int)Math.round(Math.random()*100.0);
    }

    public void submit(View view) {
        int userGuess = Integer.parseInt(String.valueOf(input.getText()).trim());
        if(userGuess>computerGuess) {
            status.setText("Guess lower!");
        }

        if(userGuess<computerGuess) {
            status.setText("Guess higher!");
        }

        if(userGuess==computerGuess) {
            status.setText("You guessed correctly!");
        }
    }
}
