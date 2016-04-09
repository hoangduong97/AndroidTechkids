package com.example.asusa42f.hwpracticebasicwidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final int[] linearTextViewID = {R.id.firstLinear, R.id.secondLinear, R.id.thirdLinear, R.id.fourthLinear, R.id.fifthLinear,
            R.id.sixthLinear, R.id.seventhLinear, R.id.eighthLinear, R.id.ninthLinear, R.id.tenthLinear};
    private final int[] nameTextViewID = {R.id.firstName, R.id.secondName, R.id.thirdName, R.id.fourthName, R.id.fifthName,
            R.id.sixthName, R.id.seventhName, R.id.eighthName, R.id.ninthName, R.id.tenthName};
    private final int[] ageTextViewID = {R.id.firstAge, R.id.secondAge, R.id.thirdAge, R.id.fourthAge, R.id.fifthAge,
            R.id.sixthAge, R.id.seventhAge, R.id.eighthAge, R.id.ninthAge, R.id.tenthAge};
    private int[] birthdayTextViewID = {R.id.firstBirthday, R.id.secondBirthday, R.id.thirdBirthday, R.id.fourthBirthday, R.id.fifthBirthday,
            R.id.sixthBirthday, R.id.seventhBirthday, R.id.eighthBirthday, R.id.ninthBirthday, R.id.tenthBirthday};

    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setComponents();
        if (GlobalVars.currentEmployee != -1) {
            for (int i = 0; i < GlobalVars.employeeVector.size(); i++) {
                LinearLayout linearLayout = (LinearLayout) findViewById(linearTextViewID[i]);
                linearLayout.setVisibility(View.VISIBLE);
                setContents(i, GlobalVars.employeeVector.get(i));
            }
        }
    }

    void setComponents() {
        addButton = (Button) findViewById(R.id.addButtonMain);
        addButton.setOnClickListener(this);
    }

    void setContents(int currentEmployee, Employee employee) {
        TextView nameTextView = (TextView) findViewById(nameTextViewID[currentEmployee]);
        nameTextView.setText(employee.getName());
        TextView ageTextView = (TextView) findViewById(ageTextViewID[currentEmployee]);
        ageTextView.setText(String.valueOf(employee.getAge()));
        TextView birthdayTextView = (TextView) findViewById(birthdayTextViewID[currentEmployee]);
        birthdayTextView.setText(String.valueOf(employee.getBirthDate()) + "-" + String.valueOf(employee.getBirthMonth()) + "-" + String.valueOf(employee.getBirthYear()));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addButtonMain:
                if (GlobalVars.currentEmployee < GlobalVars.MAX_EMPLOYEES) {
                    moveToAddEmployeeActivity();
                } else {

                }
                break;
        }
    }

    private void moveToAddEmployeeActivity() {
        Intent intent = new Intent(this, AddEmployeeActivity.class);
        startActivity(intent);
    }
}
