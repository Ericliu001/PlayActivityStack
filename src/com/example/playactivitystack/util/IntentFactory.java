package com.example.playactivitystack.util;

import com.example.playactivitystack.LoginActivity;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

public class IntentFactory {
	
	
	public static final String WHO_START_ME = "whostartme";

	public static void startLogin(Activity activity){
		Intent intent = new Intent(activity, LoginActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		
		intent.putExtra(WHO_START_ME, activity.getClass().getName());
		
		activity.startActivity(intent);
	}
	
	
	public static void goBackToActivityWhoStartedMe(Activity activity) throws ClassNotFoundException{
		String className = activity.getIntent().getStringExtra(IntentFactory.WHO_START_ME);
		if (className == null) {
			Log.i("eric", "No class name returned");
			return;
		}
		
		Log.i("eric", className);
		
		Class target = Class.forName(className);
		Intent intent = new Intent(activity, target);
		intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		activity.startActivity(intent);
		
	}

}
