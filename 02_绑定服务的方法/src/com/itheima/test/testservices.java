package com.itheima.test;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

public class testservices extends Service {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return new myBinder();
	}

	class myBinder extends Binder {
		public void getMethod(String name) {
			methodServices(name);
		}
	}

	public void methodServices(String msg) {
		Toast.makeText(this, "feoof", 1).show();
	}

}
