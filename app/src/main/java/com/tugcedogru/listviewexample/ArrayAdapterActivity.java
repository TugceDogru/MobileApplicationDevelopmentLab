package com.tugcedogru.listviewexample;


import static android.app.ProgressDialog.show;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {

    static final String[] ANIMALS = new String[]{"Ant","Bear","Bird","Cat", "Dog", "Elephant", "Fox", "Giraffe", "Monkey", "Rat", "Snake"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adapter);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_array_adapter, ANIMALS));
        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText((getApplicationContext()),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
