package com.example.trainingprograms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ExercicesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercices, container, false);

        Bundle args = getArguments();
        if (args != null) {
            String title = args.getString("title");
            setupExercisesContent(view, title);
        }
        return view;
    }

    private void setupExercisesContent(View view, String title) {
        TextView titleTextView = view.findViewById(R.id.text_view_title);
        TextView contentTextView = view.findViewById(R.id.text_view_content);
        ImageView imageView = view.findViewById(R.id.image_view_exercise);

        titleTextView.setText(title);

        switch (title) {
            case "Extremitats a Tope":
                contentTextView.setText("5 Flexions a terra\n10 Inclinacions d'una cama\n15 Flexions dorsals");
                imageView.setImageResource(R.drawable.correr);
                break;
            case "Agonia Màxima":
                contentTextView.setText("20 minuts de carrera\n5 levantaments de peses a pes mot\n4 series de flexions");
                imageView.setImageResource(R.drawable.pesas);
                break;
            case "Entrenament Especial":
                contentTextView.setText("1 hora de futbol\n1 hora de basquet\n1 hora de mato");
                imageView.setImageResource(R.drawable.futbol);
                break;
            case "Força i longitud":
                contentTextView.setText("Salt de longitud (minim 1.5 metros\nSerie de dominades fins falla\nStep Up amb salt");
                imageView.setImageResource(R.drawable.bailarina);
                break;
        }
    }
}
