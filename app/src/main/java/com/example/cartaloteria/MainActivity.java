package com.example.cartaloteria;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.carta1).setOnClickListener(this);
        findViewById(R.id.carta2).setOnClickListener(this);
        findViewById(R.id.carta3).setOnClickListener(this);
        findViewById(R.id.carta4).setOnClickListener(this);
        findViewById(R.id.carta5).setOnClickListener(this);
        findViewById(R.id.carta6).setOnClickListener(this);
        findViewById(R.id.carta7).setOnClickListener(this);
        findViewById(R.id.carta8).setOnClickListener(this);
        findViewById(R.id.carta9).setOnClickListener(this);
        findViewById(R.id.carta10).setOnClickListener(this);
        findViewById(R.id.carta11).setOnClickListener(this);
        findViewById(R.id.carta12).setOnClickListener(this);
        findViewById(R.id.carta13).setOnClickListener(this);
        findViewById(R.id.carta14).setOnClickListener(this);
        findViewById(R.id.carta15).setOnClickListener(this);
        findViewById(R.id.carta16).setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Button btn = (Button)v;

        if (btn.getText() != "X")
        {
            btn.setText("X");
            btn.setTextSize(50);
            btn.setTextColor(Color.parseColor("#ffe0b2"));
        }
        else
        {
            btn.setText("");
        }


    }
}
