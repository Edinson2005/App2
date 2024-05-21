package com.edinson.controledeseleccion;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ejercicio2 extends AppCompatActivity {

    private RadioButton rbTelevisor, rbRadio;
    private EditText etPrice, etDiscount;
    private CheckBox cbDiscount;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        rbTelevisor = findViewById(R.id.rbTelevisor);
        rbRadio = findViewById(R.id.rbRadio);
        etPrice = findViewById(R.id.etPrice);
        etDiscount = findViewById(R.id.etDiscount);
        cbDiscount = findViewById(R.id.cbDiscount);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        cbDiscount.setOnCheckedChangeListener((buttonView, isChecked) -> {
            etDiscount.setEnabled(isChecked);
            if (isChecked) {
                etDiscount.setText("10");
            } else {
                etDiscount.setText("");
            }
        });

        btnCalculate.setOnClickListener(v -> {
            double price = Double.parseDouble(etPrice.getText().toString());
            double discount = 0.0;
            if (cbDiscount.isChecked()) {
                discount = Double.parseDouble(etDiscount.getText().toString());
            }
            double total = price - (price * discount / 100);
            tvResult.setText(String.valueOf(total));
        });
    }

}