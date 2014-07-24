package com.example.playactivitystack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LoginActivity extends Activity {

	/*
	 * FLAG_ACTIVITY_CLEAR_TOP only works in the current task
	 * 
	 */
	
	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
		Log.i("eric", "Got the login instance");
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Log.i("eric", "login activity created");
	}

	public void onButtonClicked(View view) {

		switch (view.getId()) {
		case R.id.btOne:
			Intent intent1 = new Intent(LoginActivity.this, MainActivity.class);
			// intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			intent1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
			intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			/*
			 * By combining FLAG_ACTIVITY_SINGLE_TOP & FLAG_ACTIVITY_CLEAR_TOP,
			 * you can go to another task and clear all activities above the
			 * chosen one
			 */

			startActivity(intent1);
			break;

		case R.id.btTwo:
			Intent intent2 = new Intent(LoginActivity.this,
					SecondActivity.class);
			intent2.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
			intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent2);
			break;

		case R.id.btThree:
			Intent intent3 = new Intent(LoginActivity.this, ThirdActivity.class);
			intent3.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
			startActivity(intent3);
			break;

		default:
			break;
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
