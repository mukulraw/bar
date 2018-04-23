package com.tbx.bar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import com.github.library.bubbleview.BubbleTextView;

public class WriteCustomer extends AppCompatActivity {

    ProgressBar progress;
    Toolbar toolbar;

    ImageButton scan;
    EditText search;
    BubbleTextView bubble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_customer);

        progress = findViewById(R.id.progress);
        toolbar = findViewById(R.id.toolbar);
        scan = findViewById(R.id.imageButton);
        search = findViewById(R.id.editText);
        bubble = findViewById(R.id.textView3);

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

        toolbar.setTitle("Write Customer Email");

        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bubble.setVisibility(View.GONE);

            }
        });

    }
}
