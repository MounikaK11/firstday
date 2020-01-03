package com.nirmaan.task1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    String
    datauser="munnishaik@gmail.com",datapassword="cj@12344";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.etemail);
        password=findViewById(R.id.etpassword);
        login=findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                email=username.getText().toString().trim();
                pass=password.getText().toString().trim();
                if(email.isEmpty()){
                    username.setError("please enter email");
                    username.requestFocus();

                }

                else if(pass.isEmpty()){
                    password.setError("please enter password");
                    password.requestFocus();
                }
                else{
                    if(!email.equalsIgnoreCase(datauser)){
                        username.setError("please enter correct email");
                        username.requestFocus();

                    }
                    else if(!pass.euqalsIgnoreCase(datapassword)){
                        password.setError("please enter correct password");
                        password.requestFocus();
                    }
                    else
                    {
                        DatabaseReference
                                dr=FireDatabase.getInstance().getReference("users");
                        dr.child("name").setValue("hemanth");
                        dr.child("salary").setValue(15000.00);
                    }
                }


        }});
    }
}
