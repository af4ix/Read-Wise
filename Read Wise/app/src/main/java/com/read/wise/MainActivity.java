package com.read.wise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.read.wise.ArabicBooks.ArabicActivity;
import com.read.wise.EnglishBooks.EnglishActivity;
import com.read.wise.HumanPsychology.HumanActivity;
import com.read.wise.ItBooks.ItActivity;
import com.read.wise.LawBooks.LawActivity;
import com.read.wise.Magazine.MagazineActivity;
import com.read.wise.Philosophy.PhilosophyActivity;
import com.read.wise.Stories.StoriesActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView logoutImage;

    CardView humanCard, philosophyCard, lawCard, itCard;

    RelativeLayout arabic, english, stories, articles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);

          if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
              getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
              getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
              getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
              getWindow().setStatusBarColor(Color.TRANSPARENT);
          } else {
              getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
          }

          humanCard = findViewById(R.id.humanpsychology);
          philosophyCard = findViewById(R.id.philosophy);
          lawCard = findViewById(R.id.law);
          itCard = findViewById(R.id.it);
          arabic = findViewById(R.id.arabicSection);
          english = findViewById(R.id.englishSection);
          stories = findViewById(R.id.storiesSection);
          articles = findViewById(R.id.articleSection);
          logoutImage = findViewById(R.id.logout);
          logoutImage.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                  startActivity(intent);
              }
          });

          humanCard.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, HumanActivity.class);
                  startActivity(intent);
              }
          });

          philosophyCard.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, PhilosophyActivity.class);
                  startActivity(intent);
              }
          });

          lawCard.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, LawActivity.class);
                  startActivity(intent);
              }
          });

          itCard.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, ItActivity.class);
                  startActivity(intent);
              }
          });

          arabic.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, ArabicActivity.class);
                  startActivity(intent);
              }
          });

          english.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, EnglishActivity.class);
                  startActivity(intent);
              }
          });

          stories.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, StoriesActivity.class);
                  startActivity(intent);
              }
          });

          articles.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this, MagazineActivity.class);
                  startActivity(intent);
              }
          });


    }
}