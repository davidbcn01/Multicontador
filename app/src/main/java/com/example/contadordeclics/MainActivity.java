package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.contadordeclics.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    int countAll;
    int count1;
    int count2;
    int count3;
    int count4;


    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());



        binding.resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = 0;
                count1 = 0;
                count2 = 0;
                count3 = 0;
                count4 = 0;
                binding.contadorAll.setText(String.valueOf(countAll));
                binding.contador1.setText(String.valueOf(count1));
                binding.contador2.setText(String.valueOf(count2));
                binding.contador3.setText(String.valueOf(count3));
                binding.contador4.setText(String.valueOf(count4));

            }
        });

        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = countAll-count1;
                binding.contadorAll.setText(String.valueOf(countAll));
                count1 = 0;

                binding.contador1.setText(String.valueOf(count1));

            }
        });

        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = countAll-count2;
                binding.contadorAll.setText(String.valueOf(countAll));
                count2 = 0;

                binding.contador2.setText(String.valueOf(count2));

            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = countAll-count3;
                binding.contadorAll.setText(String.valueOf(countAll));
                count3 = 0;

                binding.contador3.setText(String.valueOf(count3));

            }
        });
        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = countAll-count4;
                binding.contadorAll.setText(String.valueOf(countAll));

                count4 = 0;
                binding.contador4.setText(String.valueOf(count4));

            }
        });
        binding.augmentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countAll++;
                count1++;
                binding.contadorAll.setText(String.valueOf(countAll));
                binding.contador1.setText(String.valueOf(count1));
            }
        });
        binding.augmentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countAll++;
                count2++;
                binding.contadorAll.setText(String.valueOf(countAll));
                binding.contador2.setText(String.valueOf(count2));
            }
        });
        binding.augmentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countAll++;
                count3++;
                binding.contadorAll.setText(String.valueOf(countAll));
                binding.contador3.setText(String.valueOf(count3));
            }
        });
        binding.augmentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countAll++;
                count4++;
                binding.contadorAll.setText(String.valueOf(countAll));
                binding.contador4.setText(String.valueOf(count4));
            }
        });


    }
}



