package com.santiago.mascotas;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class FavoritasActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotasFavoritas;
    private RecyclerView rvMascotasFavoritas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);


        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mascotasFavoritas = new ArrayList<Mascota>();
        mascotasFavoritas.add(new Mascota("Lucas",100,R.drawable.mascota1));
        mascotasFavoritas.add(new Mascota("Pepe",95,R.drawable.mascota2));
        mascotasFavoritas.add(new Mascota("Toby",39,R.drawable.mascota2));
        mascotasFavoritas.add(new Mascota("Scooby",88,R.drawable.mascota1));
        mascotasFavoritas.add(new Mascota("Thor",96,R.drawable.mascota2));


        rvMascotasFavoritas = findViewById(R.id.rvMacotasFavoritas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        rvMascotasFavoritas.setLayoutManager(llm);

        MascotaAdapter mascotaAdapter = new MascotaAdapter(mascotasFavoritas);
        rvMascotasFavoritas.setAdapter(mascotaAdapter);
    }
    
}