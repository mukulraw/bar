package com.tbx.bar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.github.library.bubbleview.BubbleTextView;

public class CustomerList extends AppCompatActivity {


    Toolbar toolbar;
    ProgressBar progress;
    BubbleTextView bubble;
    RecyclerView grid;
    GridLayoutManager manager;
    CustomerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        progress = findViewById(R.id.progress);
        toolbar = findViewById(R.id.toolbar);
        bubble = findViewById(R.id.textView3);

        manager = new GridLayoutManager(this, 1);
        grid = findViewById(R.id.recyclerView);

        adapter = new CustomerAdapter(this);


        grid.setAdapter(adapter);
        grid.setLayoutManager(manager);


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

        toolbar.setTitle("Customer Information");

        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bubble.setVisibility(View.GONE);

            }
        });

    }

    class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {
        Context context;

        public CustomerAdapter(Context context) {
            this.context = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.customer_list_model  , parent , false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(context , SingleCustomerActivity.class);
                    context.startActivity(intent);

                }
            });

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            public ViewHolder(View itemView) {
                super(itemView);
            }
        }
    }

}
