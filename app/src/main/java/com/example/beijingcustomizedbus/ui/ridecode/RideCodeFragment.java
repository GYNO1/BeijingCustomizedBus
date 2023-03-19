package com.example.beijingcustomizedbus.ui.ridecode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.beijingcustomizedbus.databinding.FragmentRidecodeBinding;

public class RideCodeFragment extends Fragment {

    private FragmentRidecodeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RideCodeViewModel rideCodeViewModel =
                new ViewModelProvider(this).get(RideCodeViewModel.class);

        binding = FragmentRidecodeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        rideCodeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}