package com.example.asusa42f.btvn1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Vector;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button blueButton1 = (Button) findViewById(R.id.blueButton1);
        blueButton1.setOnClickListener(this);
        Button blueButton2 = (Button) findViewById(R.id.blueButton2);
        blueButton2.setOnClickListener(this);
        Button blueButton3 = (Button) findViewById(R.id.blueButton3);
        blueButton3.setOnClickListener(this);
        Button blueButton4 = (Button) findViewById(R.id.blueButton4);
        blueButton4.setOnClickListener(this);

        Button redButton1 = (Button) findViewById(R.id.redButton1);
        redButton1.setOnClickListener(this);
        Button redButton2 = (Button) findViewById(R.id.redButton2);
        redButton2.setOnClickListener(this);
        Button redButton3 = (Button) findViewById(R.id.redButton3);
        redButton3.setOnClickListener(this);
        Button redButton4 = (Button) findViewById(R.id.redButton4);
        redButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.blueButton1:
                moveToBlueActivity();
                break;
            case R.id.blueButton2:
                moveToBlueActivity();
                break;
            case R.id.blueButton3:
                moveToBlueActivity();
                break;
            case R.id.blueButton4:
                moveToBlueActivity();
                break;
            case R.id.redButton1:
                moveToRedActivity();
                break;
            case R.id.redButton2:
                moveToRedActivity();
                break;
            case R.id.redButton3:
                moveToRedActivity();
                break;
            case R.id.redButton4:
                moveToRedActivity();
                break;
        }
    }

    private void moveToBlueActivity() {
        Intent intent = new Intent(this, BlueActivity.class);
        startActivity(intent);
    }

    private void moveToRedActivity() {
        Intent intent = new Intent(this, RedActivity.class);
        startActivity(intent);
    }
}
