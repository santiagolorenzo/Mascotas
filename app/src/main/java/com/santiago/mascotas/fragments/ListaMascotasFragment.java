package com.santiago.mascotas.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.santiago.mascotas.R;
import com.santiago.mascotas.adapter.MascotaAdapter;
import com.santiago.mascotas.pojo.Mascota;


import java.util.ArrayList;


public class ListaMascotasFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public ListaMascotasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_lista_mascotas, container, false);

        listaMascotas = view.findViewById(R.id.recyclerFragmentListaMascotas);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(linearLayoutManager);

        inicializarListaMascotas();
        inicializarAdaptador();

        return view;
    }

    public void inicializarAdaptador() {

        MascotaAdapter adaptador = new MascotaAdapter(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas() {

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota1, "Lucas"));
        mascotas.add(new Mascota(R.drawable.mascota2, "Simon"));
        mascotas.add(new Mascota(R.drawable.mascota1, "Tobita"));
        mascotas.add(new Mascota(R.drawable.mascota1, "Thor"));
        mascotas.add(new Mascota(R.drawable.mascota2, "Zeus"));
    }

}