package com.example.trainingprograms;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        LinearLayout item1 = view.findViewById(R.id.linear_layout_item1);
        LinearLayout item2 = view.findViewById(R.id.linear_layout_item2);
        LinearLayout item3 = view.findViewById(R.id.linear_layout_item3);
        LinearLayout item4 = view.findViewById(R.id.linear_layout_item4);

        item1.setOnClickListener(this);
        item2.setOnClickListener(this);
        item3.setOnClickListener(this);
        item4.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.linear_layout_item1) {
            openExercisesFragment("Extremitats a Tope");
        } else if (v.getId() == R.id.linear_layout_item2) {
            openExercisesFragment("Agonia Màxima");
        } else if (v.getId() == R.id.linear_layout_item3) {
            openExercisesFragment("Entrenament Especial");
        } else if (v.getId() == R.id.linear_layout_item4) {
            openExercisesFragment("Força i longitud");
        }
    }


    private void openExercisesFragment(String title) {
        ExercicesFragment exercisesFragment = new ExercicesFragment();

        Bundle args = new Bundle();
        args.putString("title", title);
        exercisesFragment.setArguments(args);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.exercisesFragmentContainer, exercisesFragment)
                    .addToBackStack(null)
                    .commit();
        } else {
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.listFragment, exercisesFragment)
                    .addToBackStack(null)
                    .commit();
        }
    }

}
