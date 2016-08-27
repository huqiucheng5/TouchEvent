package com.hu.touchevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG,"--onTouchEvent--");
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG,"--onTouchEvent--ACTION_DOWN--");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG,"--onTouchEvent--ACTION_MOVE--");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG,"--onTouchEvent--ACTION_UP--");
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(TAG,"--dispatchTouchEvent--");
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG,"--dispatchTouchEvent--ACTION_DOWN--");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG,"--dispatchTouchEvent--ACTION_MOVE--");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG,"--dispatchTouchEvent--ACTION_UP--");
                break;
        }
        return super.dispatchTouchEvent(event);
    }
}
