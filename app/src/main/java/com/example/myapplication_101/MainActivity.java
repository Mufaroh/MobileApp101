package com.example.myapplication_101;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import java.text.DecimalFormat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.widget.EditText;

import java.text.ParseException;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.example.myapplication_101.frag_purchase;
import com.example.myapplication_101.frag_preauth;
import com.example.myapplication_101.frag_refund;
import com.example.myapplication_101.frag_correction_ui;
import com.example.myapplication_101.frag_cashwithdrawal;
import com.example.myapplication_101.frag_balancenquiry;
import com.example.myapplication_101.frag_purchasecashback;
import  com.example.myapplication_101.frag_purchasecashback;

public class MainActivity extends AppCompatActivity
{
    private DecimalFormat decimalFormat;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Handle left icon click
        ImageView iconLeft = toolbar.findViewById(R.id.iconLeft);
        iconLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle left icon click action
                Toast.makeText(MainActivity.this, "Left Icon Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Handle right icon click
        ImageView iconRight = toolbar.findViewById(R.id.iconRight);
        iconRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle right icon click action
                Toast.makeText(MainActivity.this, "Right Icon Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
    }


    class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // Return the appropriate fragment for each tab
            switch (position) {
                case 0:
                    return new frag_purchase();
                case 1:
                   return new frag_preauth();
                case 2:
                   return new frag_refund();
                case 3:
                    return new frag_correction_ui();
                case 4:
                    return new frag_purchasecashback();
                case 5:
                    return new frag_cashwithdrawal();
                case 6:
                    return new frag_balancenquiry();
                // Add cases for other fragments as needed
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Number of tabs
            return 7; // Adjust this based on the number of tabs you have
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            // Return the tab title for each position
            switch (position)
            {
                case 0:
                    return "PURCHASE";
                case 1:
                    return "PRE-AUTH";
                case 2:
                    return "REFUND";

                case 3:
                    return "CORRECTION";
                case 4:
                    return "PURCHASE CASHBACK";
                case 5:
                    return "CASH WITHDRAWAL";
                case 6:
                    return "BALANCE ENQUIRY";
                default:
                    return null;
            }
        }
        //To add 12 October 2023...........

    }





