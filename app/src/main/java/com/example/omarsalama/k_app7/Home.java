package com.example.omarsalama.k_app7;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

public class Home extends Fragment {
    ImageView facebook;
    ImageView twitter;
    ImageView instagram;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_home, null);

    }


    @Override
    public void onViewCreated(View view , @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        facebook = (ImageView) view.findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gofacebook = new Intent();
                gofacebook.setAction(Intent.ACTION_VIEW);
                gofacebook.addCategory(Intent.CATEGORY_BROWSABLE);
                gofacebook.setData(Uri.parse("https://www.facebook.com/kvectorfoundation/?rc=p"));
                startActivity(gofacebook);
    }
}
        );

        twitter = (ImageView) view.findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotwitter = new Intent();
                gotwitter.setAction(Intent.ACTION_VIEW);
                gotwitter.addCategory(Intent.CATEGORY_BROWSABLE);
                gotwitter.setData(Uri.parse("https://twitter.com/foundation_k?lang=en"));
                startActivity(gotwitter);

            }
        });

        instagram = (ImageView) view.findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goinstagram = new Intent();
                goinstagram.setAction(Intent.ACTION_VIEW);
                goinstagram.addCategory(Intent.CATEGORY_BROWSABLE);
                goinstagram.setData(Uri.parse("https://www.instagram.com/kvectorfoundation/"));
                startActivity(goinstagram);

            }
        });
    }
}