package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity {
    Button GoBackToMainScreenContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        GoBackToMainScreenContact = findViewById(R.id.btnGoBackToMainScreenContact);

        GoBackToMainScreenContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}