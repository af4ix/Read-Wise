package com.read.wise.EnglishBooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.read.wise.ItBooks.ItBook1;
import com.read.wise.LawBooks.LawBook4;
import com.read.wise.Magazine.Magazine3;
import com.read.wise.R;
import com.read.wise.Stories.StoryBook4;

public class EnglishActivity extends AppCompatActivity {

    CardView engBook1, engBook2, engBook3, engBook4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        //hide title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        engBook1 = findViewById(R.id.english1);
        engBook2 = findViewById(R.id.english2);
        engBook3 = findViewById(R.id.english3);
        engBook4 = findViewById(R.id.english4);

        engBook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, LawBook4.class);
                startActivity(intent);
            }
        });

        engBook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, Magazine3.class);
                startActivity(intent);
            }
        });

        engBook3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, ItBook1.class);
                startActivity(intent);
            }
        });

        engBook4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, StoryBook4.class);
                startActivity(intent);
            }
        });
    }
}