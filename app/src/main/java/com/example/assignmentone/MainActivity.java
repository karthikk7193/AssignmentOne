package com.example.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private TextView firstNameTextField = null;
    private TextView lastNameTextField = null;

    private TextView resultTextField = null;

    private Button submitButton = null;
    private String firstName = "";
    private String lastName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initialize Variables
        this.firstNameTextField = findViewById(R.id.editTextFirstName);
        this.lastNameTextField = findViewById(R.id.editTextLastName);

        this.resultTextField = findViewById(R.id.textViewResult);


        this.submitButton = findViewById(R.id.submitButton);
        this.submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("My Submit Button", "Your information has been submitted");
                setUserInfo();

                Log.d("First Name: ", firstName);
                Log.d("Last Name: ", lastName);
                showResukts();


              }

        });
    }
    private void setUserInfo() {
        this.firstName = this.firstNameTextField.getText().toString();
        this.lastName = this.lastNameTextField.getText().toString();
    }

    private void showResukts(){
        String restltStr = "Hello " + firstName +" " + lastName + ". Nice to meet you";
        this.resultTextField.setText(restltStr);
    }
}


