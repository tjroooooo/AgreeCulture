package com.example.agreeculture1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.agreeculture1.R;
import com.example.agreeculture1.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private TextView analysisResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize views
        analysisResult = view.findViewById(R.id.analysisResult);

        // Assuming you get the data passed from SoilDataFragment
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String ph = bundle.getString("ph");
            String nitrogen = bundle.getString("nitrogen");
            String moisture = bundle.getString("moisture");

            // Analyze soil data and display recommendation
            analyzeSoilData(ph, nitrogen, moisture);
        }

        return view;
    }

    private void analyzeSoilData(String ph, String nitrogen, String moisture) {
        // Basic analysis logic
        String result = "";

        float phValue = Float.parseFloat(ph);
        if (phValue < 6.5) {
            result = "pH is low, consider adding lime.";
        } else if (phValue > 7.5) {
            result = "pH is high, consider adding sulfur.";
        } else {
            result = "pH is optimal.";
        }

        analysisResult.setText(result);
    }
}
