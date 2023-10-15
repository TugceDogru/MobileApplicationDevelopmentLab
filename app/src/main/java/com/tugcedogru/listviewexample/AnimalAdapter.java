package com.tugcedogru.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

public class AnimalAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Animal> animals;

    public AnimalAdapter(Activity activity, List<Animal> animals){
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.animals = animals;
    }

    public int getCount(){
        return animals.size();
    }

    public Object getItem(int i){
        return animals.get(i);
    }

    public long getItemId(int i){
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup){
        View rowView;

        rowView = mInflater.inflate(R.layout.listview_row, null);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.pic);

        Animal animal = animals.get(i);
        textView.setText(animal.getType());
        imageView.setImageResource(animal.getPicId());

        return rowView;
    }

}
