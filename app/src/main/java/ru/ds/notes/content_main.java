package ru.ds.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class content_main extends AppCompatActivity {
private ListView list;
private String[] array;
private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_main);
         list = findViewById(R.id.listView);
         array = getResources().getStringArray(R.array.continents);
         adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
         list.setAdapter(adapter);

    }
}