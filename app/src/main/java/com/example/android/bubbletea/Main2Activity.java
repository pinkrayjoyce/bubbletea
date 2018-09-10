package com.example.android.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    } public void onButtonClicked(View v){
        Intent intent = new Intent (this, Main3Activity.class);
        startActivity(intent);
    }
    public void onButtonClicked1(View v){
        Intent intent = new Intent (this, Main4Activity.class);
        startActivity(intent);
    }
    public void onButtonClicked2(View v){
        Intent intent = new Intent (this, Main5Activity.class);
        startActivity(intent);
    }
    public void onButtonClicked3(View v){
        Intent intent = new Intent (this, Main6Activity.class);
        startActivity(intent);
    }
}
