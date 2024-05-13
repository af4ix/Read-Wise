package com.read.wise.ArabicBooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.read.wise.R;

public class ArabicActivity extends AppCompatActivity {

    CardView book1, book2, book3, book4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic);

        //hide title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        book1 = findViewById(R.id.arabic1);
        book2 = findViewById(R.id.arabic2);
        book3 = findViewById(R.id.arabic3);
        book4 = findViewById(R.id.arabic4);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArabicActivity.this, FirstBook.class);
                startActivity(intent);
            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArabicActivity.this, SecondBook.class);
                startActivity(intent);
            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArabicActivity.this, TherdBook.class);
                startActivity(intent);
            }
        });

        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArabicActivity.this, FourthBook.class);
                startActivity(intent);
            }
        });

    }
}