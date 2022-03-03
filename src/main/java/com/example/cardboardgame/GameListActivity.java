package com.example.cardboardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GameListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);

        TextView tv = findViewById(R.id.textViewTitle);
        tv.setText(R.string.card + R.string.title_activity_game_list);
    }
}