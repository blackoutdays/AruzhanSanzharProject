package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.snackbar.Snackbar;

public class KazakhCultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kazakh_culture);

        // Находим кнопку и добавляем обработчик нажатия
        Button buttonShowSnackbar = findViewById(R.id.buttonShowSnackbar);
        buttonShowSnackbar.setOnClickListener(v -> showSnackbar());

        // Находим кнопку для перехода к динамическому фрагменту и добавляем обработчик нажатия
        Button buttonGoToDynamicFragment = findViewById(R.id.buttonGoToDynamicFragment);
        buttonGoToDynamicFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание и отображение динамического фрагмента при нажатии на кнопку
                DynamicFragment dynamicFragment = new DynamicFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, dynamicFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }

    // Метод для отображения Snackbar
    private void showSnackbar() {
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                "Kazakh Culture Snackbar", Snackbar.LENGTH_LONG);
        snackbar.setAction("Action", v -> {
            // Action to perform when the Snackbar action button is clicked
        });
        snackbar.show();
    }
}
