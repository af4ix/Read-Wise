package com.read.wise.Philosophy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.read.wise.R;

public class PhilosophyActivity extends AppCompatActivity {

    CardView Philo1, Philo2, Philo3, Philo4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy);

        //hide title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        Philo1 = findViewById(R.id.philosophy1);
        Philo2 = findViewById(R.id.philosophy2);
        Philo3 = findViewById(R.id.philosophy3);
        Philo4 = findViewById(R.id.philosophy4);

        Philo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhilosophyActivity.this, PhiloBook1.class);
                startActivity(intent);
            }
        });

        Philo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhilosophyActivity.this, PhiloBook2.class);
                startActivity(intent);
            }
        });

        Philo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhilosophyActivity.this, PhiloBook3.class);
                startActivity(intent);
            }
        });

        Philo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhilosophyActivity.this, PhiloBook4.class);
                startActivity(intent);
            }
        });
    }
}