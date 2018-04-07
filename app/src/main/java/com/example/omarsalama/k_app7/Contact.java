package com.example.omarsalama.k_app7;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Contact extends Fragment {

    WebView contacts;

    @SuppressLint("InflateParams")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_contact,null);

    }


    @Override
    public void onViewCreated(View view , @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        contacts = (WebView) view.findViewById(R.id.contacts);


        contacts.setWebViewClient(new WebViewClient());


        contacts.loadUrl("http://www.kvectorfoundation.com/events/events.php");



    }

}