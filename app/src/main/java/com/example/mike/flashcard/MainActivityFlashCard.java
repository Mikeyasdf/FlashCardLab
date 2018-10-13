package com.example.mike.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityFlashCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_flash_card);

        findViewById(R.id.flash_card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flash_card_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flash_card).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.flash_card_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flash_card_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flash_card).setVisibility(View.VISIBLE);
            }
        });

    }

}
