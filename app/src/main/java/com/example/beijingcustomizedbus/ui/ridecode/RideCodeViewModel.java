package com.example.beijingcustomizedbus.ui.ridecode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RideCodeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RideCodeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}