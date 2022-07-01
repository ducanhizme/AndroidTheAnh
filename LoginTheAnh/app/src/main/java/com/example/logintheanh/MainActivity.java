package com.example.logintheanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputLayout emailLayout;
    TextInputEditText emailEdit;
    TextInputEditText passwordEdit;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        onClickBtnLogin();
    }

    private void onClickBtnLogin() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEdit.getText().toString();
                if(TextUtils.isEmpty(email)){
                    emailEdit.setError("This is required");
                }else{
                    String password = passwordEdit.getText().toString();
                    Toast.makeText(MainActivity.this, email + password, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private void mapping() {
        emailLayout = findViewById(R.id.emailEditTextLayout);
        emailEdit = findViewById(R.id.emailEditText);
        passwordEdit = findViewById(R.id.passwordEditText);
        btnLogin = findViewById(R.id.btnLogin);
    }
}