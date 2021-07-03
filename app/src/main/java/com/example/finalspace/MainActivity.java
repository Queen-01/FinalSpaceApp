package com.example.finalspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindSeasonButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindSeasonButton = (Button)findViewById(R.id.findseasons);

        mFindSeasonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Watch Out!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, FindActivity.class);
                startActivity(intent);
            }
        });
    }
}