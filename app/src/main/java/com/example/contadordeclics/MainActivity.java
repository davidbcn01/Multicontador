package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int countAll;
    int count1;
    int count2;
    int count3;
    int count4;

    TextView contadorAll;
    TextView contador1;
    TextView contador2;
    TextView contador3;
    TextView contador4;

    Button resetAll;
    Button reset1;
    Button reset2;
    Button reset3;
    Button reset4;

    Button augmentar1;
    Button augmentar2;
    Button augmentar3;
    Button augmentar4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resetAll = findViewById(R.id.resetAll);
        reset1 = findViewById(R.id.reset1);
        reset2 = findViewById(R.id.reset2);
        reset3 = findViewById(R.id.reset3);
        reset4 = findViewById(R.id.reset4);

        augmentar1 = findViewById(R.id.augmentar1);
        augmentar2 = findViewById(R.id.augmentar2);
        augmentar3 = findViewById(R.id.augmentar3);
        augmentar4 = findViewById(R.id.augmentar4);

        contadorAll = findViewById(R.id.contadorAll);
        contador1 = findViewById(R.id.contador1);
        contador2 = findViewById(R.id.contador2);
        contador3 = findViewById(R.id.contador3);
        contador4 = findViewById(R.id.contador4);

        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = 0;
                count1 = 0;
                count2 = 0;
                count3 = 0;
                count4 = 0;
                contadorAll.setText(String.valueOf(countAll));
                contador1.setText(String.valueOf(count1));
                contador2.setText(String.valueOf(count2));
                contador3.setText(String.valueOf(count3));
                contador4.setText(String.valueOf(count4));

            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = countAll-count1;
                contadorAll.setText(String.valueOf(countAll));
                count1 = 0;

                contador1.setText(String.valueOf(count1));

            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = countAll-count2;
                contadorAll.setText(String.valueOf(countAll));
                count2 = 0;

                contador2.setText(String.valueOf(count2));

            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = countAll-count3;
                contadorAll.setText(String.valueOf(countAll));
                count3 = 0;

                contador3.setText(String.valueOf(count3));

            }
        });
        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll = countAll-count4;
                contadorAll.setText(String.valueOf(countAll));

                count4 = 0;
                contador4.setText(String.valueOf(count4));

            }
        });
        augmentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countAll++;
                count1++;
                contadorAll.setText(String.valueOf(countAll));
                contador1.setText(String.valueOf(count1));
            }
        });
        augmentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countAll++;
                count2++;
                contadorAll.setText(String.valueOf(countAll));
                contador2.setText(String.valueOf(count2));
            }
        });
        augmentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countAll++;
                count3++;
                contadorAll.setText(String.valueOf(countAll));
                contador3.setText(String.valueOf(count3));
            }
        });
        augmentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countAll++;
                count4++;
                contadorAll.setText(String.valueOf(countAll));
                contador4.setText(String.valueOf(count4));
            }
        });


    }
}



