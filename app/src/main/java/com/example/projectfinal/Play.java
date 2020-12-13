package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Play extends AppCompatActivity {
    int value1=0;
    int value2=0;
    int result=0;
    boolean isPlay = true;
    Button btnTrue, btnFalse;
    TextView value, tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        value = findViewById(R.id.value);
        tvResult = findViewById(R.id.tvresult);
        btnTrue = findViewById(R.id.btnTrue);
        btnFalse = findViewById(R.id.btnFalse);
        this.isPlay = true;




        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int result = value1 + value2;
                value.setText(String.valueOf(value1) + "+" + String.valueOf(value2));
                tvResult.setText("=" + String.valueOf(result));
                Intent intent = new Intent(Play.this, Play.class);
                finish();
                startActivity(intent);
            }
        });


//        while (isPlay) {
//            Random rand = new Random();
//            int upperbound = 100;
//            this.value1 = rand.nextInt(upperbound);
//            this.value2 = rand.nextInt(upperbound);
//            this.result = value1 + value2;
//            tv1.setText(value1);
//            tv2.setText(" + " + value2);
//            tvResult.setText(" = " + result);
//
//        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Random rand = new Random();
        int upperbound = 100;
        this.value1 = rand.nextInt(upperbound);
        this.value2 = rand.nextInt(upperbound);

        this.result = value1 + value2;
        this.value.setText(String.valueOf(value1) + "+" + String.valueOf(value2));
        this.tvResult.setText("="+String.valueOf(result));

//        Intent intent = getIntent();
//        finish();
//        startActivity(intent);

    }
}