package com.example.firstapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptercountry extends BaseAdapter {

    Context nContext;
    String [] nCountrylist;
    int [] nCountryflag;

    public Adaptercountry(Context nContext, String[] countryName, int[] countryImages) {
        this.nContext = nContext;
        this.nCountrylist = countryName;
        this.nCountryflag = countryImages;
    }

    @Override
    public int getCount() {
        return nCountrylist.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view;
         if(convertView==null){
             LayoutInflater inflater=LayoutInflater.from(nContext);
             view = inflater.inflate(R.layout.listviewcountry,null);
         } else {

             view = convertView;
         }

        ImageView countryImageview = view.findViewById(R.id.Imageviewcountry);
        TextView countryname = view.findViewById(R.id.textviewcountry);

        countryname.setText(nCountrylist[position]);
        countryImageview.setImageResource(nCountryflag[position]);


        return view;

    }
}
