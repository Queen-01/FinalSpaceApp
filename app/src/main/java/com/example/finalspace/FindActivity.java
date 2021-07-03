package com.example.finalspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class FindActivity extends AppCompatActivity {
    private String[] seasons = new String[]{
            "season one", "Season two", "Season three"
    };
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        mListView =(ListView) findViewById(R.id.list);
    }
}