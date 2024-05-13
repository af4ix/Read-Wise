package com.read.wise.HumanPsychology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.read.wise.R;

public class HumanActivity extends AppCompatActivity {

    CardView humanBook11, humanBook22, humanBook33, humanBook44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human);

        //hide title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        humanBook11 = findViewById(R.id.human1);
        humanBook22 = findViewById(R.id.human2);
        humanBook33 = findViewById(R.id.human3);
        humanBook44 = findViewById(R.id.human4);

        humanBook11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HumanActivity.this, HumanBook1.class);
                startActivity(intent);
            }
        });

        humanBook22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HumanActivity.this, HumanBook2.class);
                startActivity(intent);
            }
        });

        humanBook33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HumanActivity.this, HumanBook3.class);
                startActivity(intent);
            }
        });

        humanBook44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HumanActivity.this, HumanBook4.class);
                startActivity(intent);
            }
        });
    }
}