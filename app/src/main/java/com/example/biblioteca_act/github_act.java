package com.example.biblioteca_act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class github_act extends AppCompatActivity {

    private Spinner spin;
    private TextView textv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spin = (Spinner) findViewById(R.id.spin);
        textv =(TextView) findViewById(R.id.textv);

        ArrayList<String> ListadoLibros = (ArrayList<String>) getIntent().getSerializableExtra("ListadoLibros");
        ArrayAdapter<String> adapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1,ListadoLibros);
        spin.setAdapter(adapt);

    }

    public void Mostrar(View v)
    {
        String Libros = spin.getSelectedItem().toString();

        if (Libros.equals("Farenheith"))
        {
            textv.setText("El resultado de Farenheith es : 5000");
        }

        if (Libros.equals("Revival"))
        {
            textv.setText("El resultado de Revival es :12000");

        }
        if (Libros.equals("El Alquimista"))
        {
            textv.setText("El resultado de El Alquimista es : 45000");
        }

    }
}