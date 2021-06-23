package com.example.hamza.blinkeffectontext;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;

import static android.view.animation.Animation.ABSOLUTE;
import static android.view.animation.Animation.INFINITE;
import static android.view.animation.Animation.REVERSE;

public class MainActivity extends AppCompatActivity {
    TextView BlinkEffect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlinkEffect=(TextView)findViewById(R.id.txt1);
    }


    @SuppressLint("WrongConstant")
    public void btn_click(View view) {
        ObjectAnimator animator=ObjectAnimator.ofInt(BlinkEffect,"backgroundColor", Color.RED,Color.GRAY,Color.BLUE);
        animator.setDuration(500);
        animator.setEvaluator(new ArgbEvaluator());
        animator.setRepeatMode(Animation.REVERSE);
        animator.setRepeatCount(Animation.INFINITE);
        animator.start();
    }
}
