package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class BleachQuize3 extends Fragment {


    public BleachQuize3() {
        super(R.layout.fragment_bleach_quize3);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton button4 = view.findViewById(R.id.button4);
        ImageButton button5 = view.findViewById(R.id.button5);
        ImageButton button6 = view.findViewById(R.id.button6);
        ImageButton button7 = view.findViewById(R.id.button7);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment frag = new End2();

                Bundle result = new Bundle();
                result.putInt("bundleKey", 2);
                getParentFragmentManager().setFragmentResult("requestKey1", result);

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container_view, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment frag = new BleachQuize();
                Bundle result = new Bundle();
                result.putInt("bundleKey", 2);
                getParentFragmentManager().setFragmentResult("requestKey1", result);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container_view, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment frag = new End();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container_view, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment frag = new End2();
                Bundle result = new Bundle();
                result.putInt("bundleKey", 2);
                getParentFragmentManager().setFragmentResult("requestKey1", result);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container_view, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
    }


}