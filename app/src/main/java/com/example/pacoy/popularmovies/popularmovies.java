package com.example.pacoy.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pacoy.adapters.CarAdapter;
import com.example.pacoy.models.carro;

import java.util.ArrayList;

public class popularmovies extends AppCompatActivity {

   private ArrayList<carro> carros=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popularmovies);

        carros.add(
            new carro("descripcion1","titulo1",R.drawable.carros1));
        carros.add(
                new carro("descripcion2","titulo2",R.drawable.carros2));
        carros.add(
                new carro("descripcion3","titulo3",R.drawable.carros3));
        carros.add(
                new carro("descripcion4","titulo4",R.drawable.carros4));
        carros.add(
                new carro("descripcion5","titulo5",R.drawable.carros5));


        CarAdapter adapter=new CarAdapter(this,carros);

        RecyclerView lista = (RecyclerView) findViewById(R.id.listadatos);
        lista.setLayoutManager(new GridLayoutManager(this,2));
        lista.setHasFixedSize(true);
        lista.setAdapter(adapter);
    }
}
