
package com.edinson.controledeseleccion;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Seleccion2 extends AppCompatActivity {

    //PRIMER PASO DECLARO LOS ELEMENTOS QUE VOY A PROGRAMAR
    RadioButton rbFemenino , rbMasculino;
    CheckBox chIngles, chEspañol, chPortugues, chAleman;

    RadioGroup rgGenero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion2);
        //SEGUNDO PASO // REFERENCIOOOO

        referenciar(); //LLAMO AL METODO REFERENCIAR
    }
    private void referenciar (){
        rbFemenino = findViewById(R.id.rbFemenino);
        rbMasculino = findViewById(R.id.rbMasculino);
        chIngles = findViewById(R.id.chIngles);
        chEspañol = findViewById(R.id.chEspañol);
        chPortugues = findViewById(R.id.chPortugues);
        chAleman = findViewById(R.id.chAleman);
        rgGenero = findViewById(R.id.rgGenero);

        //ALERTA AL SELECIONAR LA DE UN OPCION DE ELEGIR
        rgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id== R.id.rbFemenino){
                    Toast.makeText(Seleccion2.this ,"usted es del genero Masculino", Toast.LENGTH_SHORT).show();
                } else if (id== R.id.rbMasculino) {
                    Toast.makeText(Seleccion2.this,"Usted es del Genero Femenino",Toast.LENGTH_SHORT).show();

                }
            }
        });
        //ALERTA DE SELECCIONAR MUCHOSS
        chIngles.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {
                if(ischecked){
                    Toast.makeText(Seleccion2.this ,"usted selecciono que habla en ingles", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Seleccion2.this,"Usted quitp la seleccion", Toast.LENGTH_SHORT).show();
                }

            }
        });
        chEspañol.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {
                if(ischecked){
                    Toast.makeText(Seleccion2.this ,"usted selecciono que habla en ingles", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Seleccion2.this,"Usted quitp la seleccion", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}