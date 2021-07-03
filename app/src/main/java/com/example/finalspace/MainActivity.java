package com.example.finalspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindSeasonButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindSeasonButton = (Button)findViewById(R.id.findseasonsButton);
//        mSeasonEditText = (EditText) findViewById(R.id.seasons);

        mFindSeasonButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Watch Out!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, FindActivity.class);
//                Log.d(TAG, season)
                startActivity(intent);
            }
        });
    }
}