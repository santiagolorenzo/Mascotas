package com.santiago.mascotas.layout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.santiago.mascotas.R;
import com.santiago.mascotas.adapter.MascotaAdapter;
import com.santiago.mascotas.pojo.Mascota;

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
        mascotasFavoritas.add(new Mascota(R.drawable.mascota1,"Lucas"));
        mascotasFavoritas.add(new Mascota(R.drawable.mascota2,"Pepe"));
        mascotasFavoritas.add(new Mascota(R.drawable.mascota2,"Toby"));
        mascotasFavoritas.add(new Mascota(R.drawable.mascota1,"Scooby"));
        mascotasFavoritas.add(new Mascota(R.drawable.mascota2,"Thor"));


        rvMascotasFavoritas = findViewById(R.id.rvMacotasFavoritas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        rvMascotasFavoritas.setLayoutManager(llm);

        MascotaAdapter mascotaAdapter = new MascotaAdapter(mascotasFavoritas, this);
        rvMascotasFavoritas.setAdapter(mascotaAdapter);
    }
}