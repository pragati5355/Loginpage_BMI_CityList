package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Listimages extends AppCompatActivity {
    ListView listView;

    String [] countryName ={"India","Australia","China","Finland","France","Indonesia",
                             "Iran","Italy","Japan","Mexico","Sikkim","Singapore","Sweden",
                             "Switzerland","India","Australia","China","Finland","France","Indonesia",
                             "Iran","Italy","Japan","Mexico","Sikkim","Singapore","Sweden",
                             "Switzerland"  };

    int [] countryImages ={R.drawable.india,R.drawable.australia,R.drawable.china,R.drawable.finland,
                           R.drawable.france,R.drawable.indonesia,R.drawable.iran,R.drawable.italy,
                           R.drawable.japan,R.drawable.mexico,R.drawable.sikkim,R.drawable.singapore,
                           R.drawable.sweden,R.drawable.switzerland,R.drawable.india,R.drawable.australia,R.drawable.china,R.drawable.finland,
                           R.drawable.france,R.drawable.indonesia,R.drawable.iran,R.drawable.italy,
                           R.drawable.japan,R.drawable.mexico,R.drawable.sikkim,R.drawable.singapore,
                           R.drawable.sweden,R.drawable.switzerland};

    Adaptercountry adaptercountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listimages);

        listView = findViewById(R.id.ListView);

        adaptercountry = new Adaptercountry(this,countryName,countryImages);

        listView.setAdapter(adaptercountry);

    }
}