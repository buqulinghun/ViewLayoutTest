package com.imooc.viewlayout;

import android.util.Log;
import android.view.MotionEvent;

public class ActionUtils {
	/**
	 * @param event
	 *      处理事件
	 * @param name
	 *       类型名字
	 */
	public static void processEvent(MotionEvent event,String name){
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:// 按下
			Log.i(name, "ACTION_DOWN");
			break;
		case MotionEvent.ACTION_CANCEL:// 取消
			Log.d(name, "ACTION_CANCEL");
			break;
		case MotionEvent.ACTION_MOVE:// 移动
			Log.e(name, "ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:// 松开
			Log.w(name, "ACTION_UP");
			break;
		case MotionEvent.ACTION_OUTSIDE:// 点击外面
			Log.v(name, "ACTION_OUTSIDE");
			break;

		default:
			break;
		}
	}
}
