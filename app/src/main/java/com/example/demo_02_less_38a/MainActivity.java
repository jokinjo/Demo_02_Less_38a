package com.example.demo_02_less_38a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtView;
    private boolean isOrig = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.txtView);
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOrig) {
                    txtView.setAlpha(0.5f);
                    txtView.animate().scaleXBy(2.0f).scaleYBy(2.0f);
                    isOrig = false;
                } else {
                    txtView.setAlpha(1.0f);
                    txtView.animate().scaleXBy(0.5f).scaleYBy(0.5f);
                    isOrig = true;
                }
            }
        });
    }
}
