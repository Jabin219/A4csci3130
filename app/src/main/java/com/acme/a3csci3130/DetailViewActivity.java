package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailViewActivity extends Activity {

    private EditText businessnumField, nameField, primarybusinessField, addressField, provinceField;
    Contact receivedPersonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedPersonInfo = (Contact)getIntent().getSerializableExtra("Contact");

        businessnumField = (EditText) findViewById(R.id.BusinessNum);
        nameField = (EditText) findViewById(R.id.Name);
        primarybusinessField = (EditText) findViewById(R.id.PrimaryBusiness);
        addressField = (EditText) findViewById(R.id.Address);
        provinceField = (EditText) findViewById(R.id.Province);

        if(receivedPersonInfo != null){
            businessnumField.setText(receivedPersonInfo.businessnum);
            nameField.setText(receivedPersonInfo.name);
            primarybusinessField.setText(receivedPersonInfo.primarybusiness);
            addressField.setText(receivedPersonInfo.address);
            provinceField.setText(receivedPersonInfo.province);
        }
    }

    public void updateContact(View v){
        //TODO: Update contact funcionality
    }

    public void eraseContact(View v)
    {
        //TODO: Erase contact functionality
    }
}
