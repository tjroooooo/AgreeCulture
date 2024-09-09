package com.example.agreeculture1.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.agreeculture1.R;
import com.example.agreeculture1.databinding.FragmentSlideshowBinding;

import java.util.ArrayList;
import java.util.List;

public class SlideshowFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);

        // Populate static data or retrieve from a source
        List<String> historyData = new ArrayList<>();
        historyData.add("PH: 6.5, Nitrogen: 50ppm, Moisture: 20%");
        historyData.add("PH: 6.8, Nitrogen: 40ppm, Moisture: 22%");
        historyData.add("PH: 7.0, Nitrogen: 30ppm, Moisture: 18%");

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}