package ru.pavlenty.simplegooglemap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity  implements OnMapReadyCallback {
    private GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions().position(new LatLng(55, 55)).title("Marker1"));
        map.addMarker(new MarkerOptions().position(new LatLng(20, 20)).title("Marker2"));
        map.addMarker(new MarkerOptions().position(new LatLng(-10, 55)).title("Marker1"));
        map.addMarker(new MarkerOptions().position(new LatLng(55, -10)).title("Marker1"));
        map.addMarker(new MarkerOptions().position(new LatLng(30, 55)).title("Marker1"));
    }
}
