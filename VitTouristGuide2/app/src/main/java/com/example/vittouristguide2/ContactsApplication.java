package com.example.vittouristguide2;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

public class ContactsApplication extends Application {
    public static final String APPLICATION_ID = "C4C7EC68-3432-6993-FF79-4B91D3F64B00";
    public static final String API_KEY = "38A2D852-C320-4D93-FF4B-3C4627CD6A00";
    public static final String SERVER_URL = "https://api.backendless.com";
    public static BackendlessUser user;


    @Override
    public void onCreate() {
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );





        super.onCreate();
    }
}
