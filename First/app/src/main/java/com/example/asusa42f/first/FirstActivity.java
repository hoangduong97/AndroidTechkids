package com.example.asusa42f.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by AsusA42F on 3/30/2016.
 */
public class FirstActivity extends Activity {
    public static final String LOG_TAG = "TECHKIDS";

    @Override
    protected void onCreate(Bundle instance) {
        super.onCreate(instance);
        Log.d(LOG_TAG, "CREATE");
        setContentView(R.layout.activity_first);
        Button transitionButton = (Button) findViewById(R.id.button_transition);
        transitionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToAnotherActivity();
            }
        });
    }

    private void moveToAnotherActivity() {
        Intent intent = new Intent(this, SunshineActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "START");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "RESTART");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "PAUSE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "RESUME");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "DESTROY");
    }
}
