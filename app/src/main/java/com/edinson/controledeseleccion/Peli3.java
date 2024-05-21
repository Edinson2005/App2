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

public class Peli3 extends AppCompatActivity {

    Button peli3;
    MediaPlayer tres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peli3);

        peli3 = findViewById(R.id.peli3);

        tres = MediaPlayer.create(Peli3.this, R.raw.tres);

        peli3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tres.isPlaying()) {
                    tres.pause();
                    tres.seekTo(0);
                } else {
                    tres.start();
                }
            }
        });
    }
}