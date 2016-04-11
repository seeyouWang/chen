package com.clcw.chen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class other extends Activity {
	private TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.otheractivity);
		Intent intent = this.getIntent();
		String name = intent.getStringExtra("name");
		String pass = intent.getStringExtra("pass");
		int age = intent.getIntExtra("age", 0);
		text = (TextView) this.findViewById(R.id.show);
		text.setText("用户名：" + name + "\n" + "密码：" + pass + "\n" + "年龄：" + age);

	}

}
