package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
0
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button nextPage = findViewById(R.id.next_page);

        nextPage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_about_us);

            }
        });

    }
}
