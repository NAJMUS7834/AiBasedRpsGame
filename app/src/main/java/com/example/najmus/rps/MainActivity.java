package com.example.najmus.rps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView showRules = (ImageView) findViewById(R.id.iv_rules);

        showRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewRules = new Intent(MainActivity.this,Rules.class);
                startActivity(viewRules);


            }
        });

        final ImageView playGame = (ImageView) findViewById(R.id.iv_play);

        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GamePlay = new Intent(MainActivity.this, Level.class);
                startActivity(GamePlay);
            }
        });
    }
}