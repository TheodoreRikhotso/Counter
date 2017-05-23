package com.example.admin.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView etP1,etP2;
    private Button btn1,btn2;
    private ImageView ivball;
    private Animation am;
    private Random r;
    private int num;
    int tot = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();



        etP1 = (TextView)findViewById(R.id.txtP1);
        etP2 = (TextView)findViewById(R.id.txtP2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        ivball = (ImageView) findViewById(R.id.ivBall);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = r.nextInt(600-100)+100;
                am = new TranslateAnimation(0,0,num,0);
                am.setDuration(1000);
                am.setFillAfter(true);
                am.setRepeatCount(1);
                am.setRepeatMode(Animation.REVERSE);
                ivball.setAnimation(am);
                ivball.setVisibility(v.VISIBLE);

                tot +=num/100;
                etP1.setText("Player One: " + tot);
                etP1.setTextColor(0xffff0000);
                ivball.setVisibility(View.INVISIBLE);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = r.nextInt(600-100)+100;
                am = new TranslateAnimation(0,0,num,0);

                am.setDuration(1000);
                am.setFillAfter(true);
                am.setRepeatCount(1);
                am.setRepeatMode(Animation.REVERSE);
                ivball.setAnimation(am);
                ivball.setVisibility(v.VISIBLE);
                tot +=num/100;
                etP2.setText("Player Two: " + tot);
                etP2.setTextColor(0xffff0000);




            }
        });




    }


}
