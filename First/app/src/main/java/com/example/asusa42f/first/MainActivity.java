package com.example.asusa42f.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = "TECHKIDS";

    TextView txtName;
    Button btnName;
    EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();
        Log.d(LOG_TAG, "CREATE");
    }

    private void connectView() {
        txtName = (TextView) this.findViewById(R.id.txtHelloName);
        btnName = (Button) this.findViewById(R.id.nutan);
        editName = (EditText) this.findViewById(R.id.editName);

        btnName.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToAnotherActivity();
            }
        });
    }

    private void moveToAnotherActivity() {
        Intent intent = new Intent(this, FirstActivity.class);
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
