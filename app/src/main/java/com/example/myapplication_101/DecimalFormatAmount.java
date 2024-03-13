package com.example.myapplication_101;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.DecimalFormat;
import java.text.ParseException;
public class DecimalFormatAmount extends AppCompatActivity
{
        private DecimalFormat decimalFormat;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.frag_purchasecashback);

            // Initialize the decimal format
            decimalFormat = new DecimalFormat("#,###.##");

            EditText purchaseEditText = findViewById(R.id.purchaseEditText);
            EditText cashbackEditText = findViewById(R.id.cashbackEditText);

            // Set a TextWatcher to format the input as the user types
            purchaseEditText.addTextChangedListener(createTextWatcher(purchaseEditText));
            cashbackEditText.addTextChangedListener(createTextWatcher(cashbackEditText));
        }

        private TextWatcher createTextWatcher(final EditText editText) {
            return new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }

                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        String formattedValue = decimalFormat.format(decimalFormat.parse(s.toString()));
                        editText.removeTextChangedListener(this);
                        editText.setText(formattedValue);
                        editText.setSelection(formattedValue.length());
                        editText.addTextChangedListener(this);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            };
        }
    }

