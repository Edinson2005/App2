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

public class Peli2 extends AppCompatActivity {

    Button peli2;
    MediaPlayer dos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_peli2);

        peli2 = findViewById(R.id.peli2);
        dos = MediaPlayer.create(Peli2.this, R.raw.dos);

        peli2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dos.isPlaying()) {
                    dos.pause();
                    dos.seekTo(0);
                } else {
                    dos.start();
                }
            }
        });
    }
}