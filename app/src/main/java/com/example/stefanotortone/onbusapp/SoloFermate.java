package com.example.stefanotortone.onbusapp;

import android.os.Bundle;
import android.util.Log;

/**
 * Created by stefanotortone on 15/06/17.
 */

public class SoloFermate extends MainActivity {

    final String TAG = "ONBUSAPP:solofermate";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solofermate_03);
        Log.i(TAG, "----> onCreate");
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
}
