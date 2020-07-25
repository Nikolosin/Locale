package com.example.locale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spinner = findViewById(R.id.spinner);
        Button ok = findViewById(R.id.button);
        final Locale localeRu = new Locale("ru");
        final Locale localeEn = new Locale("en");
        final Locale localeFr = new Locale("fr");
        final Configuration config = new Configuration();
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (spinner.getSelectedItemPosition()) {
                    case (0) : config.setLocale(localeRu); break;
                    case (1) : config.setLocale(localeEn); break;
                    case (2) : config.setLocale(localeFr); break;
                }
                getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                recreate();

            }
        });
    }
}
