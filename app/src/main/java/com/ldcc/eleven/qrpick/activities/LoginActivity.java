package com.ldcc.eleven.qrpick.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.ldcc.eleven.qrpick.R;
import com.ldcc.eleven.qrpick.activities.customer.CustomerActivity;
import com.ldcc.eleven.qrpick.activities.manager.ManagerActivity;

public class LoginActivity extends AppCompatActivity {
    EditText id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = findViewById(R.id.id);
        Button button = findViewById(R.id.sign_in_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.getText().toString().equals("")){
                    startActivity(new Intent(getApplicationContext(), ManagerActivity.class));
                }
                else{
                    startActivity(new Intent(getApplicationContext(), CustomerActivity.class));
                }
            }
        });

    }
}
