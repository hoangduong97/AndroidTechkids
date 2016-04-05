package com.example.asusa42f.hwbasicwidget;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    DatePickerDialog datePickerDialog;
    Dialog saveDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBirthdayDatePickerDialog();
        setBirthplaceSpinner();
        setSaveButton();
    }

    private void setBirthdayDatePickerDialog() {
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

    private void setBirthplaceSpinner() {
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.birthplaceSpinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<>();
        categories.add("Ha Noi");
        categories.add("HCMC");
        categories.add("Da Nang");
        categories.add("Hai Phong");
        categories.add("Nghe An");
        categories.add("Thanh Hoa");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    void setSaveButton() {
        Button button = (Button) findViewById(R.id.saveButton);
        button.setOnClickListener(this);

        saveDialog = new Dialog(this);
        saveDialog.setTitle("Abcd");
        saveDialog.setContentView(R.layout.save_dialog);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.birthdayEditText:
                datePickerDialog.show();
                break;
            case R.id.saveButton:
                saveDialog.show();
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
