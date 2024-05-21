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

public class Peli4 extends AppCompatActivity {
    Button peli4;
    MediaPlayer cuatro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peli4);

        peli4 = findViewById(R.id.peli4);
        cuatro= MediaPlayer.create(Peli4.this, R.raw.dos);

        peli4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cuatro.isPlaying()) {
                    cuatro.pause();
                    cuatro.seekTo(0);
                } else {
                    cuatro.start();
                }

            }
        });
    }
}