package ml.smarticles101.numberguesser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ml.smarticles101.numberguesser.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void info(View view) {
        Intent i = new Intent(this, Info.class);
        startActivity(i);
    }

    public void computer(View view) {
        Intent i = new Intent(this, ToComputer.class);
        startActivity(i);
    }

    public void user(View view) {
        Intent i = new Intent(this, ToUser.class);
        startActivity(i);
    }
}
