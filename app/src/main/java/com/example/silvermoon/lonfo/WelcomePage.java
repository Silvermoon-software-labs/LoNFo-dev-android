package com.example.silvermoon.lonfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {

//    public void init()
//    {
//        Button lost_button = (Button) findViewById(R.id.lost_button);
//        Button found_button = (Button) findViewById(R.id.found_button);
//
//        lost_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent activity2 = new Intent(WelcomePage.this, Activity2.class);
//                startActivity(activity2);
//            }
//        });
//
//        found_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent activity2 = new Intent(WelcomePage.this, Activity2.class);
//                startActivity(activity2);
//
//            }
//        });
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
//       init();

        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
    }

    private class LogoLauncher extends Thread{

        public void run(){
            try{
                sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(WelcomePage.this , LoginActivity.class);
            startActivity(intent);
            WelcomePage.this.finish();
            }
    }
}
