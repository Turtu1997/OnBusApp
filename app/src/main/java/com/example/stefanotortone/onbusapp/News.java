package com.example.stefanotortone.onbusapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by spatolal on 14/06/2017.
 */

public class News extends MainActivity {
    final String TAG = "ONBUSAPP:News";
}

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
