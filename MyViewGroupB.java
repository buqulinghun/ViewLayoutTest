package com.imooc.viewlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyViewGroupB extends LinearLayout {

    public MyViewGroupB(Context context) {
        super(context);
    }

    public MyViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroupB(Context context, AttributeSet attrs,
                        int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        ActionUtils.processEvent(ev, "ViewGroupB dispatchTouchEvent");
//        return super.dispatchTouchEvent(ev);
           return false;
//        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        ActionUtils.processEvent(ev, "ViewGroupB onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
//        return false;
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        ActionUtils.processEvent(event, "ViewGroupB onTouchEvent");
        return super.onTouchEvent(event);
    }
}
