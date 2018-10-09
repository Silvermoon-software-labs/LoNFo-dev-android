package com.example.silvermoon.lonfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity{

    public void init()
    {
        CardView register = (CardView) findViewById(R.id.RegTabAct2);
        CardView login = (CardView) findViewById(R.id.loginTabAct2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registerPpage = new Intent(Activity2.this , RegisterActivity.class);
                startActivity(registerPpage);

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginPage= new Intent(Activity2.this, LoginActivity.class);
                startActivity(loginPage);

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        init();
    }
}
