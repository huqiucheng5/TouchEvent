package com.hu.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by q623407474 on 2016/8/27.
 */
public class MyLayout extends LinearLayout {
    private static final String TAG = "MyLayout";
    public MyLayout(Context context) {
        super(context);
    }

    public MyLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.i(TAG,"--onInterceptTouchEvent--");
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG,"--onInterceptTouchEvent--ACTION_DOWN--");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG,"--onInterceptTouchEvent--ACTION_MOVE--");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG,"--onInterceptTouchEvent--ACTION_UP--");
                break;
        }
//        return super.onInterceptTouchEvent(event);
        return true;
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
}
