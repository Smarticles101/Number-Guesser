package ml.smarticles101.numberguesser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import ml.smarticles101.numberguesser.R;

public class ToUser extends AppCompatActivity {
	public final static String MIN = "ml.smarticles101.numberguesser.MIN";
	public final static String MAX = "ml.smarticles101.numberguesser.MAX";
	EditText min;
	EditText max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minmax);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		min = (EditText)findViewById(R.id.min);
		max = (EditText)findViewById(R.id.max);
    }

	public void onClick(View v) {
		Intent i = new Intent(this, User.class);
		i.putExtra(MIN, Integer.parseInt(String.valueOf(min.getText())));
		i.putExtra(MAX, Integer.parseInt(String.valueOf(max.getText())));
		startActivity(i);
	}
}
