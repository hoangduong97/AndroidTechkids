package com.example.asusa42f.hwbasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class saveDialog extends AppCompatActivity {
    TextView saveNameTextView;
    TextView saveClassTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_dialog);
        setContent();
    }

    private void setContent() {
        Student student = (Student) this.getIntent().getExtras().getSerializable("Student");
        saveNameTextView = (TextView) findViewById(R.id.saveName);
        saveNameTextView.setText(student.getName());
        saveClassTextView = (TextView) findViewById(R.id.saveClass);
        saveClassTextView.setText(student.getClasses());
    }
}
