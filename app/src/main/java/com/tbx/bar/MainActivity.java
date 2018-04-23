package com.tbx.bar;

import android.graphics.Color;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    AHBottomNavigation bottom;
    LinearLayout replace;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        bottom = findViewById(R.id.bottom);

        replace = findViewById(R.id.replace);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setTitle("Home");

        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.system, R.drawable.ic_system, R.color.white);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.card, R.drawable.ic_card, R.color.white);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.form, R.drawable.ic_form, R.color.white);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem(R.string.attention, R.drawable.ic_attention, R.color.white);

        bottom.addItem(item1);
        bottom.addItem(item2);
        bottom.addItem(item3);
        bottom.addItem(item4);

        bottom.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);

        bottom.setDefaultBackgroundColor(Color.parseColor("#000000"));

        bottom.setAccentColor(Color.parseColor("#FFD600"));
        bottom.setInactiveColor(Color.WHITE);

        //bottom.setForceTint(true);


        bottom.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {



                switch (position)
                {

                    case 0:

                        toolbar.setTitle("System");

                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }

                        System frag1 = new System();
                        ft.replace(R.id.replace, frag1);
                        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                        ft.commit();

                        break;

                    case 1:

                        toolbar.setTitle("Card");

                        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();

                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }

                        Card frag2 = new Card();
                        ft1.replace(R.id.replace, frag2);
                        ft1.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                        ft1.commit();

                        break;

                    case 2:

                        toolbar.setTitle("Customer Form");

                        FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();

                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }

                        Form frag3 = new Form();
                        ft3.replace(R.id.replace, frag3);
                        ft3.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                        ft3.commit();

                        break;

                    case 3:

                        toolbar.setTitle("Attention");

                        FragmentTransaction ft4 = getSupportFragmentManager().beginTransaction();

                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }

                        Attention frag4 = new Attention();
                        ft4.replace(R.id.replace, frag4);
                        ft4.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                        ft4.commit();

                        break;

                }



                return true;
            }
        });


        bottom.setCurrentItem(1);

        toolbar.setTitle("Card");

        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();

        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate();
        }

        Card frag2 = new Card();
        ft1.replace(R.id.replace, frag2);
        ft1.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        ft1.commit();


    }
}
