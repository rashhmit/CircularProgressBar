package com.example.circularprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    ProgressBar p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button2);
        p1=(ProgressBar) findViewById(R.id.progressBar2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setVisibility(View.INVISIBLE);
                p1.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,"Practical Performed Succesfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}