package com.example.omarsalama.k_app7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Events extends Fragment {
        WebView eventos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_events, null);
    }


    @Override
    public void onViewCreated(View view , @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

        eventos = (WebView) eventos.findViewById(R.id.eventos);
        eventos.loadUrl("http://www.kvectorfoundation.com/events/events.php");
        eventos.setWebViewClient(new WebViewClient());
    }


}
