package com.read.wise.ItBooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.read.wise.R;

public class ItActivity extends AppCompatActivity {

    CardView itBook11, itBook22, itBook33, itBook44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

        //hide title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        itBook11 = findViewById(R.id.it11);
        itBook22 = findViewById(R.id.it22);
        itBook33 = findViewById(R.id.it33);
        itBook44 = findViewById(R.id.it44);

        itBook11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItActivity.this, ItBook1.class);
                startActivity(intent);
            }
        });

        itBook22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItActivity.this, ItBook2.class);
                startActivity(intent);
            }
        });

        itBook33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItActivity.this, ItBook3.class);
                startActivity(intent);
            }
        });

        itBook44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItActivity.this, ItBook4.class);
                startActivity(intent);
            }
        });
    }
}