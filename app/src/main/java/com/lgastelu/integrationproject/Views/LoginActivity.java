package com.lgastelu.integrationproject.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lgastelu.integrationproject.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void callRegister(View view){
        startActivityForResult(new Intent(this, RegisterActivity.class), 100);
    }

    public void callList(View view){
        startActivityForResult(new Intent(this, ListActivity.class),100);
    }
}
