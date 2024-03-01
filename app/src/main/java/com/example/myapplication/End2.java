package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class End2 extends Fragment {
    public End2() {
        super(R.layout.fragment_end2);
    }
    private int result =0;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button b_back = view.findViewById(R.id.b_back);
        getParentFragmentManager().setFragmentResultListener("requestKey1", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey,
                                         @NonNull Bundle bundle) {

                result = bundle.getInt("bundleKey");
                TextView textView = view.findViewById(R.id.textView1);
                textView.setText(textView.getText() + "1");
            }
        });
        b_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Bundle result2 = new Bundle();
                result2.putString("bundleKey", "resullllt");
                getParentFragmentManager().setFragmentResult("requestKey", result2);

                Fragment frag = new BleachQuize();
                if (result == 1)
                    frag = new BleachQuize2();
                if (result == 2)
                    frag = new BleachQuize3();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container_view, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

    }
}