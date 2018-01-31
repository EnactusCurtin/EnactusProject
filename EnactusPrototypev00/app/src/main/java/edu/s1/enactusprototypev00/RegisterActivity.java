package edu.s1.enactusprototypev00;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText mRegisterEmail;
    CheckBox mRegisterTermsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRegisterEmail = (EditText) findViewById(R.id.LoginEmailET);
        mRegisterTermsCheckBox = (CheckBox) findViewById(R.id.registerTermsCheckBox);
    }

    public void registerConfirmClick(View view) {

        if (mRegisterTermsCheckBox.isChecked())
        {
            finish();
        } else {

            Toast.makeText(this, "You must agree to the terms and conditions before registering.", Toast.LENGTH_LONG).show();

        }
    }

    public void registerTermsClick(View view) {



    }
}
