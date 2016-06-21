package com.motiur.practice.androidcamera;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frontCam();
        backCam();
        autoFocus();
        flash();

        //Check number of cameras
        /*int numCameras = Camera.getNumberOfCameras();
        if (numCameras > 0) {
           Toast.makeText(getApplicationContext(),"Camera"+numCameras,Toast.LENGTH_LONG).show();
        }*/
    }



    public void frontCam(){
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT)){
            // this device has a camera
            Toast.makeText(MainActivity.this, "Has a Front Camera", Toast.LENGTH_SHORT).show();
        } else {
            // no camera on this device
            Toast.makeText(MainActivity.this, "Dont Have Front Cam", Toast.LENGTH_SHORT).show();
        }
    }

    public void backCam(){
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            Toast.makeText(MainActivity.this, "Has a Back Cam", Toast.LENGTH_SHORT).show();
        } else {
            // no camera on this device
            Toast.makeText(getApplicationContext(), "Dont Have Back Cam", Toast.LENGTH_SHORT).show();
        }
    }

    public void autoFocus(){
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_AUTOFOCUS)){
            Toast.makeText(getBaseContext(), "Auto Focus available", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Dont Have Autofocus", Toast.LENGTH_SHORT).show();
        }
    }
    public void flash(){
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)){
            Toast.makeText(this, "Flash available", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Dont Have flash", Toast.LENGTH_SHORT).show();
        }
    }
}

//Edit Manifest.xml