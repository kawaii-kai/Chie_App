package com.example.navigation.ui.kanji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigation.databinding.FragmentKanjiBinding;


public class KanjiFragment extends Fragment {

    private FragmentKanjiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KanjiViewModel kanjiViewModel =
                new ViewModelProvider(this).get(KanjiViewModel.class);

        binding = FragmentKanjiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}