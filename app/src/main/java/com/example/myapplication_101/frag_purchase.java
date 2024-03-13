package com.example.myapplication_101;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.Toast;


public class frag_purchase extends Fragment
{

@Nullable
@Override
public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
{
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.frag_purchase, container, false);

            Button confirmButton = view.findViewById(R.id.confirmButton);

            confirmButton.setOnClickListener(new View.OnClickListener() {
                @Override
                @Nullable
                public void onClick(View v) {
                    // Create an Intent to navigate to the target activity
                    Intent intent = new Intent(null, frag_preauth.class); // Replace 'TargetActivity' with the actual name of your target activity
                    // Start the target activity
                    startActivity(intent);
                }
            });


    return view;
}
    }

