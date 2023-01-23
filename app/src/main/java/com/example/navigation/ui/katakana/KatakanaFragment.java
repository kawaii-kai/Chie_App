package com.example.navigation.ui.katakana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigation.databinding.FragmentKatakanaBinding;


public class KatakanaFragment extends Fragment {

    private FragmentKatakanaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KatakanaViewModel katakanaViewModel =
                new ViewModelProvider(this).get(KatakanaViewModel.class);

        binding = FragmentKatakanaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}