package com.example.fruitsbenefits;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String [] fruitsNameIndex;
    int [] fruits_image;
    LayoutInflater inflater;


    public CustomAdapter(Context context, String[] fruitsNameIndex, int[] fruits_image) {
        this.context = context;
        this.fruitsNameIndex = fruitsNameIndex;
        this.fruits_image = fruits_image;

    }

    @Override
    public int getCount() {
        return fruitsNameIndex.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

//    Here goes converting String array to list view using inflater with convert view.

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_fruits_index, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.indexImageId);
        TextView textView = convertView.findViewById(R.id.headingId);
        textView.setText(fruitsNameIndex[position]);
        imageView.setImageResource(fruits_image[position]);

        return convertView;

    }
}