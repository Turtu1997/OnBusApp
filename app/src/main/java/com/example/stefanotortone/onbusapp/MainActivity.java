package com.example.stefanotortone.onbusapp;


import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity{

    final String TAG = "ONBUSAPP:MainActivity";
    //final String CIAO = "ciao";
    //final String hello = "ciao";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "----> onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "----> onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "----> onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "----> onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "----> onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "----> onDestroy");
    }

    public void startContacts(View view) {
        Intent intent = new Intent(this, Contacts.class);
        startActivity(intent);
    }

    public void startcercafermata(View view) {
        Intent intent = new Intent(this, CercaFermata.class);
        startActivity(intent);
    }



}
