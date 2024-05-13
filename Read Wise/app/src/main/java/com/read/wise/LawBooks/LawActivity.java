package com.read.wise.LawBooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Camera;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.read.wise.ArabicBooks.ArabicActivity;
import com.read.wise.ArabicBooks.FirstBook;
import com.read.wise.ArabicBooks.FourthBook;
import com.read.wise.ArabicBooks.SecondBook;
import com.read.wise.ArabicBooks.TherdBook;
import com.read.wise.R;

public class LawActivity extends AppCompatActivity {

    CardView lawBook1, lawBook2, lawBook3, lawBook4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);


        //hide title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        lawBook1 = findViewById(R.id.law1);
        lawBook2 = findViewById(R.id.law2);
        lawBook3 = findViewById(R.id.law3);
        lawBook4 = findViewById(R.id.law4);

        lawBook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LawActivity.this, LawBook1.class);
                startActivity(intent);
            }
        });

        lawBook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LawActivity.this, LawBook2.class);
                startActivity(intent);
            }
        });

        lawBook3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LawActivity.this, LawBook3.class);
                startActivity(intent);
            }
        });

        lawBook4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LawActivity.this, LawBook4.class);
                startActivity(intent);
            }
        });

    }
}