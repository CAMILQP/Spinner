package com.example.camilq.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);
        List list= new ArrayList();
        list.add("Jhonny Ospina");
        list.add("Mauricio Zuluaga");
        list.add("Juan Pablo");
        list.add("Andres Felipe");
        list.add("Diego Londoño");
        list.add("Isabel Zapata");
        list.add("Camilo Quintero");
        list.add("Camilo Salinas");
        list.add("Diego Andres Londoño");
        list.add("David Montoya");
        list.add("Johana Tangarife");
        list.add("Erika Garcia");
        list.add("Juan Gabriel");
        list.add("Jhonatan Alzate");
        list.add("Edward Salazar");
        list.add("Hector Alzate");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Nombre Seleccionado: " + String.valueOf(spinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
            {
            }
                                          }
        );
    }
}
