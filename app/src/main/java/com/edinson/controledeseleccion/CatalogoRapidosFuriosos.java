package com.edinson.controledeseleccion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CatalogoRapidosFuriosos extends AppCompatActivity {
    ListView PeliculasRa ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_rapidos_furiosos);

        referencia ();
    }

    private void referencia () {
        PeliculasRa = findViewById(R.id.PeliculasRa);


        PeliculasRa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(CatalogoRapidosFuriosos.this, "Usted Presiono " + adapterView.getItemAtPosition(position),Toast.LENGTH_SHORT).show();

                if( position == 0) {
                    Intent goNext = new Intent(CatalogoRapidosFuriosos.this, VistaPeli.class);
                    startActivity(goNext);
                }
                if (position == 1){
                    Intent goNext = new Intent(CatalogoRapidosFuriosos.this,Peli2.class);
                    startActivity(goNext);
                }
                if (position == 2){
                    Intent goNext = new Intent(CatalogoRapidosFuriosos.this, Peli3.class);
                    startActivity(goNext);
                }
                if (position == 3){
                    Intent goNext = new Intent(CatalogoRapidosFuriosos.this, Peli4.class);
                    startActivity(goNext);
                }
                if (position == 4){
                    Intent goNext = new Intent(CatalogoRapidosFuriosos.this, Purga.class);
                    startActivity(goNext);
                }

            }
        });
    }
}