package com.example.finalspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FindActivity extends AppCompatActivity {
    private String[] seasons = new String[]{
            "season one", "Season two", "Season three"
    };
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        mListView = (ListView) findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, seasons);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seasons = ((TextView)view).getText().toString();
                Toast.makeText(FindActivity.this, seasons, Toast.LENGTH_LONG).show();
            }
        });
    }
}