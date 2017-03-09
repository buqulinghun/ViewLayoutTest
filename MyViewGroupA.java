package com.imooc.viewlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MyViewGroupA extends LinearLayout {

    public MyViewGroupA(Context context) {
        super(context);
    }

    public MyViewGroupA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroupA(Context context, AttributeSet attrs,
                        int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
          ActionUtils.processEvent(ev,"ViewGroupA dispatchTouchEvent");
//          return true;
//        return false;
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
           ActionUtils.processEvent(ev,"ViewGroupA onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
//            return true;
//        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
           ActionUtils.processEvent(event,"ViewGroupA onTouchEvent");
           return super.onTouchEvent(event);
//        return true;
    }
}
