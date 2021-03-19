package com.example.coffeemealreused;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;

public class LoginSelectActivity extends AppCompatActivity {

    private Button btnEmail, btnSns, loginKakao, loginGoogle;
    private ConstraintLayout snsLayout;
    private Animation translateUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_select);

        btnEmail = findViewById(R.id.btnEmail);
        btnSns = findViewById(R.id.btnSns);
        loginKakao = findViewById(R.id.loginKakao);
        loginGoogle = findViewById(R.id.loginGoogle);
        snsLayout = findViewById(R.id.snsLayout);
        translateUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_up);

        btnSns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator.ofFloat(snsLayout, "translationY", -100f)
                        .setDuration(300)
                        .start();
                snsLayout.startAnimation(translateUp);

                //snsLayout.startAnimation(translateUp);
                btnEmail.setVisibility(View.GONE);
                btnSns.setVisibility(View.GONE);
                snsLayout.setVisibility(View.VISIBLE);
            }
        });

    }
}