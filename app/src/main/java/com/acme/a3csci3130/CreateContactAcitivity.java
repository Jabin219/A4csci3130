package com.acme.a3csci3130;

import android.app.Activity;
import android.location.Address;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class CreateContactAcitivity extends Activity {

    private Button submitButton;
    private EditText businessnumField, nameField, primarybusinessField, addressField, provinceField;
    private MyApplicationData appState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact_acitivity);
        //Get the app wide shared variables
        appState = ((MyApplicationData) getApplicationContext());

        submitButton = (Button) findViewById(R.id.submitButton);
        businessnumField = (EditText) findViewById(R.id.BusinessNum);
        nameField = (EditText) findViewById(R.id.Name);
        primarybusinessField = (EditText) findViewById(R.id.PrimaryBusiness);
        addressField = (EditText) findViewById(R.id.Address);
        provinceField = (EditText) findViewById(R.id.Province);
    }

    public void submitInfoButton(View v) {
        //each entry needs a unique ID
        String personID = appState.firebaseReference.push().getKey();
        String businessnum = businessnumField.getText().toString();
        String name = nameField.getText().toString();
        String primarybusiness = primarybusinessField.getText().toString();
        String address = addressField.getText().toString();
        String province = provinceField.getText().toString();
        Contact person = new Contact(personID, businessnum, name, primarybusiness, address, province);

        appState.firebaseReference.child(personID).setValue(person);

        finish();

    }
}
