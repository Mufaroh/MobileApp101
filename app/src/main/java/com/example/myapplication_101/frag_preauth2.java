package com.example.myapplication_101;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

public class frag_preauth2 extends Fragment
{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.frag_preauth2, container, false);

            // Add your fragment-specific functionality here
            Button preAuthButton = view.findViewById(R.id.preAuthButton);

            // Set click listeners for the buttons
            preAuthButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    frag_purchase preAuthFragment = new frag_purchase();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.pre_auth2_container, preAuthFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }

            });
            return view;


        }

    }
}
