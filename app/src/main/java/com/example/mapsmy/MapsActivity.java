package com.example.mapsmy;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        LatLng SPBU = new LatLng(-0.862178, 134.066070);
        mMap.addMarker(new MarkerOptions().position(SPBU).title("POM BENSIN SANGGENG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU));

        LatLng SPBU1 = new LatLng(-0.867199, 134.063796);
        mMap.addMarker(new MarkerOptions().position(SPBU1).title("POM BENSIN ANGKA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU1));

        LatLng SPBU2 = new LatLng(-0.869583, 134.060777);
        mMap.addMarker(new MarkerOptions().position(SPBU2).title("POM BENSIN DEPOT"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU2));

        LatLng SPBU3 = new LatLng(-0.873638, 134.047720);
        mMap.addMarker(new MarkerOptions().position(SPBU3).title("POM BENSIN Jalan Baru"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU3));

        LatLng SPBU4 = new LatLng(-0.881222, 134.046443);
        mMap.addMarker(new MarkerOptions().position(SPBU4).title("POM BENSIN Esausesa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU4));

        LatLng SPBU5 = new LatLng(-0.874249, 134.047559);
        mMap.addMarker(new MarkerOptions().position(SPBU5).title("POM BENSIN TKUNG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU5));
    }
}
