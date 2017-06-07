package com.example.stefanotortone.onbusapp;

import android.app.Activity;
import android.util.Log;


/**
 * Created by alessandro on 07/06/17.
 */

public class Contacts extends Activity {
    final String TAG = "";

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


