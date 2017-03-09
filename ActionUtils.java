package com.imooc.viewlayout;

import android.util.Log;
import android.view.MotionEvent;

public class ActionUtils {
	/**
	 * @param event
	 *      �����¼�
	 * @param name
	 *       ��������
	 */
	public static void processEvent(MotionEvent event,String name){
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:// ����
			Log.i(name, "ACTION_DOWN");
			break;
		case MotionEvent.ACTION_CANCEL:// ȡ��
			Log.d(name, "ACTION_CANCEL");
			break;
		case MotionEvent.ACTION_MOVE:// �ƶ�
			Log.e(name, "ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:// �ɿ�
			Log.w(name, "ACTION_UP");
			break;
		case MotionEvent.ACTION_OUTSIDE:// �������
			Log.v(name, "ACTION_OUTSIDE");
			break;

		default:
			break;
		}
	}
}
