package com.example.spsm.androidassignment_6_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button startBtn;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
        startBtn = (Button) findViewById(R.id.button);

        startBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.setVisibility(TextView.VISIBLE);
                Animation blinkInAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animblilnk);
                text.startAnimation(blinkInAnimation);
                blinkInAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Toast.makeText(MainActivity.this, "Animation Started", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Toast.makeText(MainActivity.this, "Animaiton Ended", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                        Toast.makeText(MainActivity.this, "Animaiton on Repeat", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }
}
