package com.example.navigation.ui.home;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.navigation.Courses;
import com.example.navigation.R;
import com.example.navigation.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment{

    private FragmentHomeBinding binding;
    Activity context;
    Button grammar;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle Instances){


        context = getActivity();
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;

    }
    public void onStart() {
        super.onStart();
        Button btncourses = (Button) context.findViewById(R.id.btncourses);
        btncourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Courses.class);
                startActivity(intent);
            }
        });
    }
        @Override
    public void onDestroyView(){
        super.onDestroyView();
        binding = null;

    }
}