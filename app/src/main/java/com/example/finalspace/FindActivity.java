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

import butterknife.BindView;
import butterknife.ButterKnife;

public class FindActivity extends AppCompatActivity {
    private String[] seasons = new String[]{
            "Season one", "Season two", "Season three"
    };
//    private String[] episodes = new String[] {
//            "chapter one", "chapter two", "chapter three", "chapter four", "chapter five",
//            "chapter six", "chapter seven", "chapter eight", "chapter nine", "chapter ten" };

    @BindView(R.id.list) ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        ButterKnife.bind(this);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seasons = ((TextView)view).getText().toString();
                Toast.makeText(FindActivity.this, seasons, Toast.LENGTH_LONG).show();
            }
        });
    }
}