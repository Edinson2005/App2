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

public class VistaPeli extends AppCompatActivity {

    Button audio;
    MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_peli);

        audio = findViewById(R.id.audio);
        sonido = MediaPlayer.create(VistaPeli.this,R.raw.audio);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sonido.isPlaying()) {
                    sonido.pause();
                    sonido.seekTo(0);
                } else {
                    sonido.start();
                }
            }
        });
    }
}