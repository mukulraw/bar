package com.tbx.bar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class System extends Fragment {

    TextView language , dataPrint , deleteMonthly , changeAcccNo , deletePosition , sendEmail , autoSaveDate , writeCustomer;

    TextView lostCard , customerInfo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.system , container , false);


        language = view.findViewById(R.id.language);
        dataPrint = view.findViewById(R.id.language2);
        deleteMonthly = view.findViewById(R.id.language4);
        changeAcccNo = view.findViewById(R.id.language3);
        deletePosition = view.findViewById(R.id.language5);
        sendEmail = view.findViewById(R.id.language6);
        autoSaveDate = view.findViewById(R.id.language7);
        writeCustomer = view.findViewById(R.id.language8);
        lostCard = view.findViewById(R.id.language9);
        customerInfo = view.findViewById(R.id.language10);


        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext() , ChangeLanguage.class);
                startActivity(intent);

            }
        });

        dataPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext() , "Print All Data" , Toast.LENGTH_SHORT).show();

            }
        });

        deleteMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext() , Delete.class);
                startActivity(intent);

            }
        });

        deletePosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext() , Delete.class);
                startActivity(intent);

            }
        });


        changeAcccNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext() , SendEmail.class);
                startActivity(intent);

            }
        });



        autoSaveDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext() , "Auto Data Save is On" , Toast.LENGTH_SHORT).show();

            }
        });


        writeCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext() , WriteCustomer.class);
                startActivity(intent);

            }
        });


        lostCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext() , LostCard.class);
                startActivity(intent);

            }
        });


        customerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext() , CustomerList.class);
                startActivity(intent);

            }
        });

        


        return view;
    }
}
