package com.example.agreeculture1.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.agreeculture1.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment using the generated binding class
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Example of setting up a ViewModel (you might need to change this to your own ViewModel)
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        // Example of interacting with views in the fragment layout using binding
        // binding.someTextView.setText("Soil data goes here");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up the binding to avoid memory leaks
        binding = null;
    }
}