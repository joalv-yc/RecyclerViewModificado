package com.example.recyclerviewmodificado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Persona> personas;
    private RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(linearLayoutManager);

       /* rating =(RatingBar)findViewById(R.id.ratingBar3);
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(MainActivity.this,"Usted Califico la pelicula con "+rating,Toast.LENGTH_LONG);
            }
        });*/


        initializarDatos();
        RVAdapter rvAdapter = new RVAdapter(personas,getApplicationContext());
        recyclerView.setAdapter(rvAdapter);
    }

    private void initializarDatos() {
        personas = new ArrayList<>();

        personas.add(new Persona("Interestellar","Aventura ","Viajes espaciales.",R.drawable.pelicula1));
        personas.add(new Persona("Ocean Eleven","Comedia","Estafas en Las Vegas",R.drawable.pelicula2));
        personas.add(new Persona("John Wick","Accion","Asesino profesional",R.drawable.pelicula3));
        personas.add(new Persona("Avengers","Accion","Superheroes reclutados",R.drawable.pelicula4));
        personas.add(new Persona("Geminis","Accion","Asesino y clones",R.drawable.pelicula5));
        personas.add(new Persona("Capitan America","Accion","Superheoe de antaño",R.drawable.pelicula6));
        personas.add(new Persona("Joker","Drama","Payaso con locura",R.drawable.pelicula7));
        personas.add(new Persona("Guardian Invisible","Suspenso","Investigaciones",R.drawable.pelicula8));
        personas.add(new Persona("Sonic","Infantil","Pelicula de comedia de Sonic",R.drawable.pelicula9));
        personas.add(new Persona("Nosotros","Terror","Siniestro encuentro.",R.drawable.pelicula10));
    }
}