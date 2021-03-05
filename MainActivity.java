package com.example.splashanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.splashanimation.R.drawable.*;

public class MainActivity extends AppCompatActivity {
ImageView iv;
AnimationDrawable animationDrawable;
Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.imageview);
        start = findViewById(R.id.start);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setBackgroundResource(splashscreen_animation_list);
                animationDrawable = (AnimationDrawable) iv.getBackground();
                animationDrawable.start();
            }
        });

    }

}
