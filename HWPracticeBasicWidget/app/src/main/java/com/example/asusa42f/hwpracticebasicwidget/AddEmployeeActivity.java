package com.example.asusa42f.hwpracticebasicwidget;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class AddEmployeeActivity extends AppCompatActivity implements View.OnClickListener {
    EditText nameEditText;
    EditText ageEditText;
    Button addButton;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        setComponents();
    }

    public void setComponents() {
        addButton = (Button) findViewById(R.id.addButtonAddEmployee);
        addButton.setOnClickListener(this);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        ageEditText = (EditText) findViewById(R.id.ageEditText);

        /* Set DatePickerDialog */
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        final EditText editText = (EditText) findViewById(R.id.birthdayEditText);
        editText.setInputType(InputType.TYPE_NULL);
        //editText.requestFocus();

        editText.setOnClickListener(this);

        Calendar calendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                editText.setText(simpleDateFormat.format(newDate.getTime()));
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addButtonAddEmployee:
                moveToMainActivity();
                break;
            case R.id.birthdayEditText:
                datePickerDialog.show();
                break;
        }
    }

    public void moveToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        GlobalVars.currentEmployee++;
        String name = nameEditText.getText().toString();
        int age = Integer.parseInt(ageEditText.getText().toString());
        int birthDate = datePickerDialog.getDatePicker().getDayOfMonth();
        int birthMonth = datePickerDialog.getDatePicker().getMonth() + 1;
        int birthYear = datePickerDialog.getDatePicker().getYear();
        Employee employee = new Employee(name, age, birthDate, birthMonth, birthYear);
        GlobalVars.employeeVector.add(employee);
        Bundle bundle = new Bundle();
        bundle.putSerializable(GlobalVars.EMPLOYEE_KEY, employee);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
