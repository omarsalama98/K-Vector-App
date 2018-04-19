package com.example.omarsalama.k_app7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Projects extends Fragment {
    TextView academic, Juniors, Events, Magazine;
    LinearLayout academic_layout, events_layout,juniors_layout,magazine_layout;
    boolean academic_visible = true, juniors_visible = true, events_visible = true, magazine_visible = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_projects, null);

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        academic = view.findViewById(R.id.academic);
        Events = view.findViewById(R.id.Events);
        Juniors = view.findViewById(R.id.Juniors);
        Magazine = view.findViewById(R.id.Magazine);
        academic_layout = view.findViewById(R.id.academic_layout);
        academic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (academic_visible) {
                    academic_layout.setVisibility(View.VISIBLE);
                    academic_visible = (!academic_visible);
                } else {
                    academic_layout.setVisibility(View.GONE);
                    academic_visible = (!academic_visible);
                }

            }
        });
        events_layout = view.findViewById(R.id.events_layout);
        Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (events_visible) {
                    events_layout.setVisibility(View.VISIBLE);
                    events_visible = (!events_visible);
                } else {
                    events_layout.setVisibility(View.GONE);
                    events_visible = (!events_visible);
                }
            }
        });
        juniors_layout = view.findViewById(R.id.juniors_layout);
        Juniors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (juniors_visible) {
                    juniors_layout.setVisibility(View.VISIBLE);
                    juniors_visible = (!juniors_visible);
                } else {
                    juniors_layout.setVisibility(View.GONE);
                    juniors_visible = (!juniors_visible);
                }
            }
        });
        magazine_layout=view.findViewById(R.id.Magazine_layout);
        Magazine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (magazine_visible) {
                    magazine_layout.setVisibility(View.VISIBLE);
                    magazine_visible = (!magazine_visible);
                } else {
                    magazine_layout.setVisibility(View.GONE);
                    magazine_visible = (!magazine_visible);
                }
            }
        });
//    academicBtn = (Button) view.findViewById(R.id.academicBtn);
//       academicBtn.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Intent academic = new Intent(getActivity(), Academic.class);
//               startActivity(academic);
//           }
//
//       });
//        Button juniorBtn = (Button)view.findViewById(R.id.juniorBtn);
//        juniorBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent junior = new Intent(getActivity(),Juniors.class);
//                startActivity(junior);
//            }
//        });

    }
}
