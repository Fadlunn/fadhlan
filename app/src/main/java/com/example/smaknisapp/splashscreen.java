package com.example.smaknisapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //ini untuk pengaturan lamanya splash screen berjalan

        Thread thread = new Thread(){
            public void  run(){
                try {
                    sleep(2000); //set Waktu Pending selama 2 detik
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                    startActivity(new Intent(splashscreen.this,MainActivity.class));
                    finish(); // Menutup Activity
                }
            }
        };
        thread.start();
    }
}