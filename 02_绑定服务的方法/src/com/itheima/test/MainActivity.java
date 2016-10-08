package com.itheima.test;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Toast;

import com.itheima.test.testservices.myBinder;

public class MainActivity extends Activity {
	private myBinder myBinder;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent intent = new Intent(this, testservices.class);
		startService(intent);
	}
	public void get(View view ){
		Intent intent = new Intent(this, testservices.class);
		//需要将第三个参数定义为Binder.auto
		//如果想要使用0.。必须手动创建服务开始
		bindService(intent,new myconn(),0);
		Toast.makeText(this, "f556546", 1).show();
	}
	class myconn implements ServiceConnection{

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			myBinder = (myBinder) service;
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public void resive(View v){
		myBinder.getMethod("kkdf");
	}
}
