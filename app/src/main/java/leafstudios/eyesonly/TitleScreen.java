package leafstudios.eyesonly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleScreen extends AppCompatActivity {

    Button playButton;
    Button settingsButton;
    int hiScore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        playButton = (Button) findViewById(R.id.playButton);
        settingsButton = (Button) findViewById(R.id.settingsButton);
    }

    void goToGame(View view)
    {
        Intent intent = new Intent(view.getContext(), GameScreen.class);
        startActivity(intent);
    }

}
