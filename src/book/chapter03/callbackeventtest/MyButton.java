package book.chapter03.callbackeventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;


//���ڻص����¼�����
/*
 
 View���а����Ļص�������Ҫ�У�
 1��boolean onKeyDown��int keyCode��KeyEvent event��
          ���ǽӿ�KeyEvent.Callback�еĳ��󷽷������ڲ�׽�ֻ����̱����µ��¼���keyCodeΪ�����µļ�ֵ���������룻eventΪ�����¼��Ķ���
          �����˴����¼�����ϸ��Ϣ�����û����°���ʱ��ϵͳ���Զ����¼���װ��KeyEvent����Ӧ�ó���ʹ�á�
 2��boolean onKeyUp��int keyCode��KeyEvent event��
          ���ڲ�׽�ֻ����̰���̧����¼���
 3��boolean onTouchEvent(MotionEvent event)
          ���ڴ����ֻ���Ļ�Ĵ����¼���������Ļ�����¡���Ļ��̧������Ļ���϶���
          
  ���� ���л��ڻص����¼�����������һ��boolean���͵ķ���ֵ������¼������˷���true������¼�δ������false��
          
 */
public class MyButton extends Button {

	private Context context;
	
	
	public MyButton(Context context,AttributeSet attrs) {//���췽���б�����AttributeSet����
		super(context,attrs);
		this.context=context;
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "MyButton�д����¼������ˣ�", Toast.LENGTH_SHORT).show();
		return true;
	}
	

}
