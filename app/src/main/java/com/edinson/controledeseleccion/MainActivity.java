 package com.edinson.controledeseleccion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //1 DECLARO LOS COMPONENTES DE LA VISTA QUE VOY A PROGRAMAR
    Button btn;
    ListView listPeliculas;
    Spinner spFrutas;

    //PASO 4 CREO UN ARRAY DE STRING EN EL CODIGO JAVA
    String [] frutas = new String[]{"Uva","Pera","Fresa"};
    String [] Equipos = new String[]{"America","Real Madrid"};
    ArrayAdapter<String> adapterfrutas, adapterEquipos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //PASO 2 REFERENCAR (SIEMPRE SIEMPRE DEBO REFERENCIAR)
        referenciar ();

        //PASO 5 AHORA LLENO el adaptador con el contexto, formato de visualizacion y la lista

        adapterfrutas = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, frutas);
        listPeliculas.setAdapter(adapterfrutas);

        adapterEquipos = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,Equipos);
        spFrutas.setAdapter(adapterEquipos);
    }
    //PASO 3

    private void referenciar(){
        listPeliculas = findViewById(R.id.listPeliculas);
        spFrutas = findViewById(R.id.spFrutas);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent(MainActivity.this, Ejercicio2.class);
                startActivity(goNext);
            }
        });


        spFrutas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"seleciono "+ adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        listPeliculas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "Usted Presiono " + adapterView.getItemAtPosition(position),Toast.LENGTH_SHORT).show();

            }
        });



    }
}