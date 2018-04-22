package com.example.najmus.rps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        final ImageView play10 = (ImageView) findViewById(R.id.iv_L10);

        play10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Level10 = new Intent(Level.this, Play10.class);
                startActivity(Level10);
            }
        });

        final ImageView play15 = (ImageView) findViewById(R.id.iv_L15);

        play15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Level15 = new Intent(Level.this, Play15.class);
                startActivity(Level15);
            }
        });

        final ImageView play20 = (ImageView) findViewById(R.id.iv_L20);

        play20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Level20 = new Intent(Level.this, Play20.class);
                startActivity(Level20);
            }
        });

        final ImageView play30 = (ImageView) findViewById(R.id.iv_L30);

        play30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Level30 = new Intent(Level.this, Play30.class);
                startActivity(Level30);
            }
        });


        final Button playGame = (Button) findViewById(R.id.b_marathon);

        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Marathon = new Intent(Level.this, Play.class);
                startActivity(Marathon);
            }
        });
    }
}
