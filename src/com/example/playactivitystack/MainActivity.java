package com.example.playactivitystack;

import com.example.playactivitystack.util.IntentFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
		Log.i("eric", "Got the 1 instance");
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("eric", "1 activity created");
	}

	public void onButtonClicked(View view) {
		Intent intent;
		switch (view.getId()) {
		case R.id.btLogin:
//			 intent = new Intent(MainActivity.this, LoginActivity.class);
//			 intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this flag is only useful in conjunction with the <launchMode> setting
//			startActivity(intent);
			
			IntentFactory.startLogin(this);
			break;

		case R.id.btNext:
			intent = new Intent(MainActivity.this, SecondActivity.class);
	    	startActivity(intent);
			break;

		default:
			break;
		}

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
