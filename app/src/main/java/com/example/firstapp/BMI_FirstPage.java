package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BMI_FirstPage extends AppCompatActivity {
    ImageView Bmilogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i__first_page);

        Bmilogo = findViewById(R.id.ImageBmilogo);
        Bmilogo.setOnClickListener( new BmiClicklistener());

    }

    class BmiClicklistener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(BMI_FirstPage.this,BMICalculator.class);
            startActivity(intent);
        }
    }

}