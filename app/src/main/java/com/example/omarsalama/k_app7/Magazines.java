package com.example.omarsalama.k_app7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class Magazines extends Fragment {
    GridView gridView;
    String[] values = {
            "ay 7aga",
            "wala 7aga",
            "kol 7aga",
            "ay 5ara"

    };
    int[] images = {
            R.drawable.spirit,
            R.drawable.cars,
            R.drawable.artiintelli,
            R.drawable.psycho


    };

    @SuppressLint("InflateParams")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout,null);

    }

    @Override
    public void onViewCreated(View view , @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridView = (GridView) view.findViewById(R.id.griview);

        GridAdapter gridAdapter = new GridAdapter(getContext(), values, images);

        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent spirit;
                    spirit = new Intent(getActivity(), spirit.class);
                    startActivity(spirit);
                }

            }
        });


    }
}
