package com.example.omarsalama.k_app7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class Magazines extends Fragment {
    GridView gridView;
    String[] values = new String[] {
            "روح تركها جسدها",
            "كائن السيارة العجيب",
            "حياتي وكوب قهوة",
            "لدغة السقيع"

    };
    int[] images = new int[] {
            R.drawable.spirit,
            R.drawable.car,
            R.drawable.coff,
            R.drawable.snow
    };

    @SuppressLint("InflateParams")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("testing", "onCreateView: created");
        return inflater.inflate(R.layout.layout,null);


    }

    @Override
    public void onViewCreated(View view , @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridView = (GridView) view.findViewById(R.id.griview);
        Log.i("testing", "on View Created: created");
        GridAdapter gridAdapter = new GridAdapter(getContext(), values, images);
        Log.i("testing", "onCreateView: grid created");
        gridView.setAdapter(gridAdapter);
        Log.i("testing", "onCreateView: adapter attached ");

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent spirit =new Intent(getActivity(), spirit.class);
                        startActivity(spirit);
                        break;
                    case 1:
                        Intent cars = new Intent(getActivity(), Cars.class);
                        startActivity(cars);
                        break;
                    case 2:
                        Intent coffee =new Intent(getActivity(), Coffee.class);
                        startActivity(coffee);
                        break;
                    case 3:
                        Intent frost = new Intent(getActivity(), Snowbite.class);
                        startActivity(frost);
                        break;
                }
            }
        });


    }
}
