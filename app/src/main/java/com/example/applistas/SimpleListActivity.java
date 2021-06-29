package com.example.applistas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;

import com.example.applistas.databinding.ActivitySimpleListBinding;

import java.util.ArrayList;

public class SimpleListActivity extends Activity {

    private ActivitySimpleListBinding binding;
    private WearableRecyclerView lista_simple;
    private Adaptador adaptadorListaSimple;
    private String valorPorDefault = "Elemento";
    private ArrayList<String> elementos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimpleListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        rellanar_lista();

        adaptadorListaSimple = new Adaptador (valorPorDefault, elementos);
        lista_simple = (WearableRecyclerView) findViewById(R.id.simple_recyclerview);

        lista_simple.setEdgeItemsCenteringEnabled(true);
        lista_simple.setLayoutManager(new LinearLayoutManager(this));
        lista_simple.setHasFixedSize(true);
        lista_simple.setAdapter(adaptadorListaSimple);


    }

    public void rellanar_lista(){
        //Crear datos dummy

        elementos = new ArrayList<>();
        elementos.add("Lunes");
        elementos.add("Martes");
        elementos.add("Miercoles");
        elementos.add("Jueves");
        elementos.add("Viernes");
    }
}