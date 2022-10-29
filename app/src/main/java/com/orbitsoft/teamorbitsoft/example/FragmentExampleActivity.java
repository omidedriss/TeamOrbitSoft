package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orbitsoft.teamorbitsoft.R;


public class FragmentExampleActivity extends AppCompatActivity {
    Fragment fragment;
    boolean change=false;
    public static FragmentExampleActivity instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);
        instance=this;
        fragment = new Fragment1();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment);
        ft.commit();

        Button button = findViewById(R.id.next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change = !change;
                if (change){
                    fragment = new Fragment1();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, fragment);
                    ft.commit();
                }else {
                    fragment = new Fragment2();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, fragment);
                    ft.commit();
                }

            }
        });

    }
}