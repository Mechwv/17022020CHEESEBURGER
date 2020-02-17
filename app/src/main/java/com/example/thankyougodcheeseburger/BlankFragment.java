package com.example.thankyougodcheeseburger;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class BlankFragment extends Fragment {

    private View view;
    public BlankFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_blank, container, false);
        ExtendedFloatingActionButton btn = view.findViewById(R.id.floatingActionButton);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Snackbar.make(view,R.string.hello_blank_fragment,Snackbar.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
