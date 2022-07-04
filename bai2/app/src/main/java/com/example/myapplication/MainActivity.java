package com.example.myapplication;

import static java.util.stream.Collectors.mapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Button btnExit ;
    Button btnGreet;
    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onExit();
        onHello();
    }

    private void onHello() {
        btnGreet.setOnClickListener(v->{
            Toast.makeText(this, "Xin chào bạn: "+editName.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }

    private void onExit() {
        btnExit.setOnClickListener(v->{
            finish();
        });
    }

    private void initView() {
        btnExit = findViewById(R.id.exit);
        btnGreet = findViewById(R.id.greetBtn);
        editName = findViewById(R.id.editName);
    }

}