package knigh4ttk.application.counterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(score);
    }

    public void count(View v) {
        score++;
        display(score);
    }
    private void display(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.score);
        quantityTextView.setText("" + score);
    }
}