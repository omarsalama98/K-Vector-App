package com.example.omarsalama.k_app7;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

public class Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_home, null);

    }


    @Override
    public void onViewCreated(View view , @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

    }
}