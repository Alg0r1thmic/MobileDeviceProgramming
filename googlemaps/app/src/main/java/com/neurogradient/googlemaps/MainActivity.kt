package com.neurogradient.googlemaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions

class MainActivity : AppCompatActivity() , OnMapReadyCallback{
    private var map:GoogleMap?=null
    private var mMapfragment:SupportMapFragment?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMapfragment= supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mMapfragment?.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap?) {
        this.map=map
        map?.moveCamera(CameraUpdateFactory.newLatLngZoom(
         LatLng(1.22122,-77.12222),10f
        ));
    }
}
