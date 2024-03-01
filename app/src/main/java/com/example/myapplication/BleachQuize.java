package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BleachQuize extends Fragment {
    private static final String TAG = "MyApp";
    public BleachQuize() {
        super(R.layout.fragment_bleach_quize);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onCreate!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onCreate");

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button updateButton = view.findViewById(R.id.Startbn);
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onViewCreated!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс onViewCreated");
        updateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment frag = new BleachQuize2();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container_view, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onViewStateRestored!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onViewStateRestored");
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onStart!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onResume!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onPause!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onStop!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onSaveInstanceState!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onDestroyView!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Context context = getActivity().getApplicationContext();
        CharSequence text = "Класс в onDestroy!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Класс в onDestroy");
    }
}