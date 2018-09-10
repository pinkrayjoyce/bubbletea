package com.example.android.bubbletea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.*;

public class Main5Activity extends AppCompatActivity {
    int cups = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    private TextView number;

    public void clickMinus (View view){
        cups--;
        number=findViewById(R.id.numberOfcups);
        if (cups<1){
            number.setText("?");
            cups=0;
        }
        else
            number.setText(String.valueOf(cups));

    }
    public void clickPlus (View view){
        cups++;
        number=findViewById(R.id.numberOfcups);
        if (cups<1){
            number.setText("cups");
            cups=1;
        }
        else
            number.setText(String.valueOf(cups));

    }

}

