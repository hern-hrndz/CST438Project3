package com.example.andriod_project3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText name, pass;
    private Button loginBtn,regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.username);
        pass = findViewById(R.id.password);

        loginBtn = findViewById(R.id.loginBtn);
        regBtn = findViewById(R.id.regBtn);

        // register button
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, create_account.class);
                startActivity(intent);
            }
        });
    }
}
