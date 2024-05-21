package com.edinson.controledeseleccion;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Purga extends AppCompatActivity {

    Button peli5;
    MediaPlayer purga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purga);

        peli5 = findViewById(R.id.peli5);

        purga =MediaPlayer.create(Purga.this, R.raw.purga);

        peli5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (purga.isPlaying()) {
                    purga.pause();
                    purga.seekTo(0);
                } else {
                    purga.start();
                }


            }
        });
    }

}