package com.tbx.bar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import com.github.library.bubbleview.BubbleTextView;

public class SendEmail extends AppCompatActivity {

    ProgressBar progress;
    Toolbar toolbar;

    ImageButton scan;
    EditText search;
    BubbleTextView bubble;
    Button delete;
    RecyclerView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);

        progress = findViewById(R.id.progress);
        toolbar = findViewById(R.id.toolbar);
        scan = findViewById(R.id.imageButton);
        search = findViewById(R.id.editText);
        bubble = findViewById(R.id.textView3);
        delete = findViewById(R.id.button5);
        grid = findViewById(R.id.grid);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.setTitleTextColor(Color.WHITE);

        toolbar.setNavigationIcon(R.drawable.back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        toolbar.setTitle("Send Customer Data");

        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bubble.setVisibility(View.GONE);

            }
        });

    }
}
