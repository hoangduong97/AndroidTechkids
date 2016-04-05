package com.example.asusa42f.bundle;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.messageEditText);

        Button button = (Button) findViewById(R.id.sendButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = MainActivity.this.editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("Message", value); // key = "Message"
                moveToNextActivity(bundle);
            }
        });
    }

    void moveToNextActivity(Bundle bundle) {
        Intent intent = new Intent(this, ShowMessage.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
