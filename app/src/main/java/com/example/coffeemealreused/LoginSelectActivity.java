package com.example.coffeemealreused;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class LoginSelectActivity extends AppCompatActivity {

    private Button btnEmail, btnSns, loginKakao, loginGoogle;
    private ConstraintLayout snsLayout;
    //private Animation translateUp;
    private ObjectAnimator translateUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_select);

        btnEmail = findViewById(R.id.btnEmail);
        btnSns = findViewById(R.id.btnSns);
        loginKakao = findViewById(R.id.loginKakao);
        loginGoogle = findViewById(R.id.loginGoogle);
        snsLayout = findViewById(R.id.snsLayout);
        //translateUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_up);
        //translateUp = Ani

        btnSns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //snsLayout.startAnimation(translateUp);
                btnEmail.setVisibility(View.GONE);
                btnSns.setVisibility(View.GONE);
                snsLayout.setVisibility(View.VISIBLE);
            }
        });

    }
}