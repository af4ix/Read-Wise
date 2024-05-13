package com.read.wise.Stories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.read.wise.R;

public class StoriesActivity extends AppCompatActivity {

    CardView bookStory1, bookStory2, bookStory3, bookStory4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        //hide title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        bookStory1 = findViewById(R.id.story11);
        bookStory2 = findViewById(R.id.story22);
        bookStory3 = findViewById(R.id.story33);
        bookStory4 = findViewById(R.id.story44);

        bookStory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoriesActivity.this, StoryBook1.class);
                startActivity(intent);
            }
        });

        bookStory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoriesActivity.this, StoryBook2.class);
                startActivity(intent);
            }
        });

        bookStory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoriesActivity.this, StoryBook3.class);
                startActivity(intent);
            }
        });

        bookStory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoriesActivity.this, StoryBook4.class);
                startActivity(intent);
            }
        });
    }
}