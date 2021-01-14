package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

import com.example.myandroid.model.MainActivityObserver;

public class MainActivity extends AppCompatActivity {


    private String TAG = this.getClass().getSimpleName();
    private static final int CAMERA_REQUEST = 1888;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getCamera();
        getLifecycle().addObserver(new MainActivityObserver());


        Log.i(TAG, "owner onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "owner onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "owner onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "owner onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "owner onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "owner onDestroy");
    }

    public void getCamera() {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }
}