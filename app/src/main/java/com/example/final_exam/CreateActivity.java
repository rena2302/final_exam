package com.example.final_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class CreateActivity extends AppCompatActivity {
    EditText emailInput,passwordInput,cfPasswordInput,userNameInput;
    String email,pass,cfPass,userName;
    Button btnSubmit;
    TextView haveAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        emailInput=findViewById(R.id.email);
         passwordInput=findViewById(R.id.password);
        cfPasswordInput=findViewById(R.id.rePassword);
        btnSubmit=findViewById(R.id.loginButton);
        userNameInput=findViewById(R.id.username);
        haveAccount=findViewById(R.id.haveAccount);
        haveAccount.setOnClickListener(v->{
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("userName","pppppp");
            intent.putExtra("password","ppppppp");
            startActivity(intent);
        });
        btnSubmit.setOnClickListener(v -> {
            email=emailInput.getText().toString();
            pass=passwordInput.getText().toString();
            cfPass=cfPasswordInput.getText().toString();
            userName=userNameInput.getText().toString();
            if(email.isEmpty()||pass.isEmpty()||cfPass.isEmpty()||userName.isEmpty()){
                Toast.makeText(CreateActivity.this,"Please enter all the fields",Toast.LENGTH_LONG).show();
            }
            else{
                if(email.length()>=8){
                    if(validEmail(email)){
                        if(userName.length()>=6){
                            if(pass.length()>6||cfPass.length()>6){
                                if(pass.equals(cfPass)){
                                    // success case
                                    Intent intent  = new Intent(this, MainActivity.class);
                                    intent.putExtra("userName",userName);
                                    intent.putExtra("password",pass);
                                    startActivity(intent);
                                }
                            }
                            else{
                                Toast.makeText(CreateActivity.this,"Enter enter password > 6 length!",Toast.LENGTH_LONG).show();
                            }
                        }
                        else{
                            Toast.makeText(CreateActivity.this,"Enter enter user name >= 6 length!",Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(CreateActivity.this,"Enter valid e-mail!",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(CreateActivity.this,"Enter enter email >= 8 length ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private boolean validEmail(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }
}