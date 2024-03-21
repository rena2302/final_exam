package com.example.final_exam;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    EditText userNameView,userPasswordView;
    Button btn;
    String name,password;
    String userInputName,userInputPassword;
    TextView toRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameView = findViewById(R.id.username);
        userPasswordView = findViewById(R.id.password);
        btn=findViewById(R.id.loginButton);
        toRegister=findViewById(R.id.createNewAccount);
        toRegister.setOnClickListener(v->{
            Intent intent = new Intent(this,CreateActivity.class);
            startActivity(intent);
        });
        name= getIntent().getStringExtra("userName");
        password= getIntent().getStringExtra("password");
        Log.d("userName", name);
        Log.d("password", password);
        if(name.isEmpty()||password.isEmpty()){
            Toast.makeText(MainActivity.this,"Please register first",Toast.LENGTH_LONG).show();
        }
        else{
            eventSubmit();
        }

    }
    private void eventSubmit(){
        btn.setOnClickListener(v->{
            userNameView.findViewById(R.id.username);
            userPasswordView.findViewById(R.id.password);
            userInputName=userNameView.getText().toString();
            userInputPassword=userPasswordView.getText().toString();
            if(userInputName.isEmpty()||userInputPassword.isEmpty()){
                Toast.makeText(MainActivity.this,"Enter enter all filed",Toast.LENGTH_LONG).show();
            }
            else {
                if(userInputName.equals(name)){
                    if(userInputPassword.equals(password)){
                        //success case
                        Log.d("LOGIN ", "Login success");
                        setClick();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"userName or password invalid",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"userName or password invalid",Toast.LENGTH_LONG).show();
                }
            }
        });
        setClick();
    }
    private void setClick(){
        btn.setOnClickListener(v->{
            Intent i = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(i);
        });
    }

}