package ie.ul.cbroderick.linearlightsoutlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LightsOutGame mGame;
    private TextView mGameStateTextView;
    private Button[] mButtons;

    private static final int NUM_SQUARES = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGame = new LightsOutGame(NUM_SQUARES);

        mGameStateTextView = findViewById(R.id.game_state_text_view);
        mButtons = new Button[NUM_SQUARES];
        mButtons[0] = findViewById(R.id.button0);
        mButtons[1] = findViewById(R.id.button1);
        mButtons[2] = findViewById(R.id.button2);
        mButtons[3] = findViewById(R.id.button3);
        mButtons[4] = findViewById(R.id.button4);
        mButtons[5] = findViewById(R.id.button5);
        mButtons[6] = findViewById(R.id.button6);
        updateView();

    }

    private void updateView() {
        //mGameStateTextView.setText(mGame.getNumPresses());

    }
}
