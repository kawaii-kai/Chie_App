package com.example.navigation.ui.kanji;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KanjiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public KanjiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is kanji fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}