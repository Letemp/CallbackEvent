package book.chapter03.callbackeventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;


//基于回调的事件处理
/*
 
 View类中包含的回调方法主要有：
 1、boolean onKeyDown（int keyCode，KeyEvent event）
          它是接口KeyEvent.Callback中的抽象方法，用于捕捉手机键盘被按下的事件。keyCode为被按下的键值，即键盘码；event为按键事件的对象，
          包含了触发事件的详细信息。当用户按下按键时，系统会自动将事件封装成KeyEvent对象供应用程序使用。
 2、boolean onKeyUp（int keyCode，KeyEvent event）
          用于捕捉手机键盘按键抬起的事件。
 3、boolean onTouchEvent(MotionEvent event)
          用于处理手机屏幕的触摸事件，包括屏幕被按下、屏幕被抬起、在屏幕中拖动。
          
  几乎 所有基于回调的事件处理方法都有一个boolean类型的返回值。如果事件处理了返回true，如果事件未处理返回false。
          
 */
public class MyButton extends Button {

	private Context context;
	
	
	public MyButton(Context context,AttributeSet attrs) {//构造方法中必须有AttributeSet参数
		super(context,attrs);
		this.context=context;
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "MyButton中触摸事件出发了！", Toast.LENGTH_SHORT).show();
		return true;
	}
	

}
