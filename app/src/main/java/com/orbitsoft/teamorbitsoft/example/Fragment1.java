package com.orbitsoft.teamorbitsoft.example;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

public class Fragment1 extends Fragment {
    Fragment fragment;
//    Context activityTemp;

//    public Fragment1(Activity activity){
//        activityTemp =activity;
//    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment




        return inflater.inflate(R.layout.fragment_fragment1, container, false);



    }
}
