package com.example.asusa42f.bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);
        //Log.d("DEBUG", this.getIntent().getExtras().getString("Message"));
        TextView textView = (TextView) findViewById(R.id.showMessage);
        textView.setText(this.getIntent().getExtras().getString("Message"));
        // this.getIntent.getExtras() -> bundle
        // .getString(key) -> getString by key
    }
}
