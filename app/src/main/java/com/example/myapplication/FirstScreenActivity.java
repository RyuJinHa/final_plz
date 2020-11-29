package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.*;

public class FirstScreenActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);

        try{
            sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
