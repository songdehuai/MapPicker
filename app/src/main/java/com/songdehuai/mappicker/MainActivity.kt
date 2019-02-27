package com.songdehuai.mappicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tencent.tencentmap.mapsdk.maps.SupportMapFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val mapFragment = fm.findFragmentById(R.id.ten_map_fr) as SupportMapFragment
        val tencentMap = mapFragment.map

        val mapUiSettings = tencentMap.uiSettings
        mapUiSettings.isMyLocationButtonEnabled = true

    }

}
