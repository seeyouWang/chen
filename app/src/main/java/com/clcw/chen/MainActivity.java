package com.clcw.chen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText name, pass;
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name = (EditText) this.findViewById(R.id.name);
		pass = (EditText) this.findViewById(R.id.pass);
		button = (Button) this.findViewById(R.id.login);

		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String names = name.getText().toString();
				String passs = pass.getText().toString();
				Intent intent = new Intent(MainActivity.this, other.class);
				intent.putExtra("name", names);
				intent.putExtra("pass", passs);
				intent.putExtra("age", 21);
				startActivity(intent);
			}
		});
	}

}
