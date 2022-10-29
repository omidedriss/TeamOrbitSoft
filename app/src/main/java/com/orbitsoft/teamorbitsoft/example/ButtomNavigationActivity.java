package com.orbitsoft.teamorbitsoft.example;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.databinding.ActivityButtomNavigationBinding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class ButtomNavigationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_buttom_navigation);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                // the selected fragment
                // by using there id.
                Fragment selectedFragment = null;
//                int itemId = item.getItemId();
                if (item.getItemId() == R.id.navigation_home) {

                    selectedFragment = new Fragment1();
                } else if (item.getItemId() == R.id.navigation_dashboard) {
                    selectedFragment = new Fragment2();
                }
                else if (item.getItemId() == R.id.navigation_notifications) {
                    selectedFragment = new Fragment1();

                }
                // It will help to replace the
                // one fragment to other.
                if (selectedFragment != null) {


                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                }
                return true;
            }
        });


    }
}