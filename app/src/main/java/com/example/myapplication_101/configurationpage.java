package com.example.myapplication_101;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class configurationpage extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.frag_correction_ui, container, false);

            // Add your fragment-specific functionality here
            return view;
        }
    }
}
