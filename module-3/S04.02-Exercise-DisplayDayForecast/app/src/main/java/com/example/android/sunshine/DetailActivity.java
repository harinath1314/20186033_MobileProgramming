package com.example.android.sunshine;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView weatherTextView = (TextView) findViewById(R.id.tv_display_weather);

        // complete (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();

//        if (intent != null) {
            if (intent.hasExtra(Intent.EXTRA_TEXT)) {
                String weatherForecast = intent.getStringExtra(Intent.EXTRA_TEXT);
                weatherTextView.setText(weatherForecast);
//            }
        }
    }
}