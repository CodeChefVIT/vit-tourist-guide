package com.example.napp;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;
import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    LocationManager locationManager;
    LocationListener locationListener;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setActionBar(toolbar);




        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        BottomNavigationView navigationView= findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.direction:

                        break;
                    case R.id.events:
                        Intent a = new Intent(MapsActivity.this,sss.class);
                        startActivity(a);
                        break;
                    case R.id.SignIn:
                        Intent c = new Intent(MapsActivity.this,signin.class);

                        startActivity(c);

                        break;
                }

                return false;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.topbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        LatLng latLng;


        switch(item.getItemId())
        {
            case R.id.A:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.B:
                latLng=new LatLng(12.974625,79.157473);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.C:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.D:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.E:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.F:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.G:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.H:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.J:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.K:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.L:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.M:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.N:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.P:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;
            case R.id.Q:
                latLng=new LatLng(12.973203,79.157291);
                mMap.addMarker(new MarkerOptions().position(latLng));
                break;



        }






        return super.onOptionsItemSelected(item);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

                mMap.clear();

                LatLng sydney = new LatLng(location.getLatitude(), location.getLongitude());
                mMap.addMarker(new MarkerOptions().position(sydney));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,6.0f));

                Geocoder geocoder=new Geocoder(getApplicationContext(), Locale.getDefault());
                try {
                    List<Address> listaddreses= geocoder.getFromLocation(location.getLatitude(),location.getLongitude(),1);
                    if(listaddreses != null && listaddreses.size()>0)
                    {
                        Log.i("Place info",listaddreses.get(0).toString());
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };


        if (Build.VERSION.SDK_INT < 23) {
            if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    Activity#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for Activity#requestPermissions for more details.
                return;
            }
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        }else{
            if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
            }else {
                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);
                //Location lastknownlocation= locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                //mMap.clear();
                //LatLng sydney = new LatLng(lastknownlocation.getLatitude(), lastknownlocation.getLongitude());
                //mMap.addMarker(new MarkerOptions().position(sydney).title("Your Location"));
                //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

            }
        }
    }
}
