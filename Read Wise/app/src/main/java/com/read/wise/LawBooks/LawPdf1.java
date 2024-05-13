package com.read.wise.LawBooks;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.github.barteksc.pdfviewer.PDFView;
import com.read.wise.R;

public class LawPdf1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_pdf1);

        //hide title bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        PDFView pdf1 = findViewById(R.id.lawPdf11);
        pdf1.fromAsset("law1.pdf").load();
    }
}