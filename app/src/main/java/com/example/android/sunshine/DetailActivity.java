package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @SuppressWarnings("FieldCanBeLocal")
    private TextView weatherForDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        weatherForDay = findViewById(R.id.weather_for_day);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            String weather = intent.getStringExtra(Intent.EXTRA_TEXT);
            weatherForDay.setText(weather);
        }
    }

}
