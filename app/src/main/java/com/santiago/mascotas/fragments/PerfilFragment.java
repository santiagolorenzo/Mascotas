package com.santiago.mascotas.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.santiago.mascotas.R;
import com.santiago.mascotas.adapter.MascotaAdapter;
import com.santiago.mascotas.pojo.Mascota;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {

    ArrayList<Mascota> miMascota;
    private RecyclerView fotosMiMascota;


    public PerfilFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        fotosMiMascota = view.findViewById(R.id.recyclerFragmentMiMascota);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        fotosMiMascota.setLayoutManager(gridLayoutManager);

        inicializarListaMiMascota();
        inicializarAdaptador();

        // Inflate the layout for this fragment
        return view;
    }

    public void inicializarListaMiMascota() {

        miMascota = new ArrayList<Mascota>();

        miMascota.add(new Mascota(R.drawable.mascota1, "Lucas"));
        miMascota.add(new Mascota(R.drawable.mascota1, "Lucas"));
        miMascota.add(new Mascota(R.drawable.mascota2, "Lucas"));
        miMascota.add(new Mascota(R.drawable.mascota1, "Lucas"));
        miMascota.add(new Mascota(R.drawable.mascota2, "Lucas"));
    }


    public void inicializarAdaptador() {

        MascotaAdapter adaptador = new MascotaAdapter(miMascota, getActivity());
        fotosMiMascota.setAdapter(adaptador);

    }

}
