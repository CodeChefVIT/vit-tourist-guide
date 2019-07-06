package com.example.vittouristguide2;

import android.content.Intent;
import android.database.Cursor;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class Signin extends AppCompatActivity {
    EditText et1,editText2;
    Button b3;


    public void yeah(View view)
    {
        et1=findViewById(R.id.et1);
        editText2=findViewById(R.id.editText2);
        b3=findViewById(R.id.b3);

        String name= et1.getText().toString();
        String password=editText2.getText().toString();

        if(name.isEmpty()||password.isEmpty())
        {
            Toast.makeText(this,"Username  or password not entered",Toast.LENGTH_LONG).show();
        }
        else {
            Backendless.UserService.login(name, password, new AsyncCallback<BackendlessUser>() {
                @Override
                public void handleResponse(BackendlessUser response) {


                    Log.i("yeah!aaaaa","done");
                    ContactsApplication.user = response;
                    Intent intent = new Intent(Signin.this,com.example.vittouristguide2.Club_Login.class);
                    startActivity(intent);
                    Signin.this.finish();

                }

                @Override
                public void handleFault(BackendlessFault fault) {

                }
            }, true);



        }











    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


    }}