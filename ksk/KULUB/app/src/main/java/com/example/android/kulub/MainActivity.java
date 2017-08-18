package com.example.android.kulub;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout homeLayout;
    private ConstraintLayout scheduleLayout;
    private ConstraintLayout myPageLayout;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    homeLayout.setVisibility(View.VISIBLE);
                    scheduleLayout.setVisibility(View.INVISIBLE);
                    myPageLayout.setVisibility(View.INVISIBLE);
                    return true;
                case R.id.navigation_schedule:
                    homeLayout.setVisibility(View.INVISIBLE);
                    scheduleLayout.setVisibility(View.VISIBLE);
                    myPageLayout.setVisibility(View.INVISIBLE);
                    return true;
                case R.id.navigation_notifications:
                    homeLayout.setVisibility(View.INVISIBLE);
                    scheduleLayout.setVisibility(View.INVISIBLE);
                    myPageLayout.setVisibility(View.VISIBLE);
                    return true;
                default:
                    homeLayout.setVisibility(View.INVISIBLE);
                    scheduleLayout.setVisibility(View.INVISIBLE);
                    myPageLayout.setVisibility(View.INVISIBLE);
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeLayout = (ConstraintLayout)findViewById(R.id.include_home);
        scheduleLayout = (ConstraintLayout)findViewById(R.id.include_schedule);
        myPageLayout = (ConstraintLayout)findViewById(R.id.include_my_page);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.navigation_home);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
