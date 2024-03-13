package com.example.myapplication_101;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.content.Intent;

public class frag_preauth extends Fragment
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
                public void onClick(View v)
                {

//                    PreAuthButton preauthbtn= new PreAuth
//                            FragmantTransaction transaction=getFragmentManager().beginTransaction();
//                    transaction.Replace(R.id.fragment_container, preauthbtn);
//                    transaction.addToBackStack(name:null);
//                    transaction.commit();



                    // Perform an action when Pre Auth button is clicked
                    // For example, navigate to another activity or fragment
                    // Intent intent = new Intent(YourActivity.this, AnotherActivity.class);


                }
            });
            return view;


        }

    }
}



