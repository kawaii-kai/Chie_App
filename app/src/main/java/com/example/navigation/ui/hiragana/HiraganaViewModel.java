package com.example.navigation.ui.hiragana;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HiraganaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HiraganaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}