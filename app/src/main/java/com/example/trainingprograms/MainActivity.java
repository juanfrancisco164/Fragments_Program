package com.example.trainingprograms;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_land);

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            ListFragment listFragment = new ListFragment();
            transaction.replace(R.id.listFragment, listFragment);

            ExercicesFragment exercisesFragment = new ExercicesFragment();
            transaction.add(R.id.exercisesFragmentContainer, exercisesFragment);

            transaction.commit();
        } else {
            setContentView(R.layout.activity_main);

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            ListFragment listFragment = new ListFragment();
            transaction.replace(R.id.listFragment, listFragment);

            transaction.commit();
        }
    }

}