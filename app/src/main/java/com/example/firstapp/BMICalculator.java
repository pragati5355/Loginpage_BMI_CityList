package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class BMICalculator extends AppCompatActivity {

    float weight,height=200;
    int count_weight=50,count_age=19;
    TextView heighttxt,age;
    boolean male_clk=true,female_clk=true,check1=true,check2=true;

    ImageView maleimg;
    ImageView femaleimg;
    TextView maletxt;
    TextView femaletxt;
    ImageView weightadd;
    ImageView weightminus;
    ImageView ageadd;
    ImageView ageminus;
    ImageView btncalculate;
    TextView weight1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i_calculator);

        maleimg = findViewById(R.id.Maleimg);
        femaleimg = findViewById(R.id.Femaleimg);
        maletxt = findViewById(R.id.Maletxt);
        femaletxt = findViewById(R.id.Femaletxt);
        weightadd = findViewById(R.id.Weightpuls);
        weightminus = findViewById(R.id.Weightminus);
        ageadd = findViewById(R.id.Ageplus);
        ageminus = findViewById(R.id.Ageminus);
        btncalculate = findViewById(R.id.Calculatebtn);
        weight1 = findViewById(R.id.WeightNo);
        heighttxt = findViewById(R.id.Heightno);
        age = findViewById(R.id.Ageno);

        maleimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check1) {
                    if (male_clk) {

                        maletxt.setTextColor(Color.parseColor("#E80C57"));
                        male_clk = false;
                        check2 = false;

                    } else {

                        maletxt.setTextColor(Color.parseColor("#FFFFFFFF"));
                        male_clk = true;
                        check2 = true;


                    }
                }
            }
        });

        femaleimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check2) {
                    if (female_clk) {
                        femaletxt.setTextColor(Color.parseColor("#E80C57"));
                        male_clk = false;
                        check2 = false;

                    } else {

                        femaletxt.setTextColor(Color.parseColor("#FFFFFF"));
                        male_clk = true;
                        check2 = true;
                    }
                }
            }
        });

        CheckSeekbarStatus();
        Checkweight();
        Checkage();

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }


        private void Checkage(){

            ageadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    count_age ++;
                    age.setText(String.valueOf(count_age));

                }
            });

            ageminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    count_age --;
                    age.setText(String.valueOf(count_age));
                }
            });

        }

    private void Checkweight(){

        weightadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_weight ++;
                weight1.setText(String.valueOf(count_weight));

            }
        });

        weightminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_weight --;
                weight1.setText(String.valueOf(count_weight));
            }
        });

        weight=Float.parseFloat(weight1.getText().toString());
    }



    private void CheckSeekbarStatus(){

        SeekBar seekBar=findViewById(R.id.Seekbar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String ht=progress+getResources().getString(R.string.cm);
                heighttxt.setText(ht);
                height=(float)(progress)/100;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void calculateBMI(){
        float BMI=weight/(height*height);
        Intent intent=new Intent(BMICalculator.this,BMICalculator1.class);
        intent.putExtra("BMI",BMI);
        intent.putExtra("age",age.getText().toString());
        startActivity(intent);
    }
}
















