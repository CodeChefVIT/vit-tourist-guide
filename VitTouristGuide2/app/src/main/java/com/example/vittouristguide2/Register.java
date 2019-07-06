package com.example.vittouristguide2;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class Register extends AppCompatActivity {

    EditText password,repass;
    TextView fname,cn;

    public void add(View view){
        cn=findViewById(R.id.cn);
        password=findViewById(R.id.password);
        repass=findViewById(R.id.repass);
        fname=findViewById(R.id.fname);

        if(cn.getText().toString().isEmpty()||fname.getText().toString().isEmpty()||password.toString().isEmpty())
        {
            Toast.makeText(Register.this,"Please fill in all the details",Toast.LENGTH_LONG).show();
        }
        //else if(password.getText().toString().trim()!=repass.getText().toString().trim())
        //{
          //  Toast.makeText(Register.this,"Created password and retyped password don't match",Toast.LENGTH_LONG).show();
        //}
        else
        {
            BackendlessUser user=new BackendlessUser();
            user.setProperty("Faculty",fname.getText().toString().trim());
            user.setProperty("name",cn.getText().toString().trim());
            user.setPassword(password.getText().toString().trim());



            Backendless.UserService.register(user, new AsyncCallback<BackendlessUser>() {
                @Override
                public void handleResponse(BackendlessUser response) {
                    Toast.makeText(Register.this,"User registered",Toast.LENGTH_LONG).show();
                    Intent i =new Intent(Register.this,com.example.vittouristguide2.Signin.class);
                    startActivity(i);

                }

                @Override
                public void handleFault(BackendlessFault fault) {

                }
            });





        }





    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);







    }
}
