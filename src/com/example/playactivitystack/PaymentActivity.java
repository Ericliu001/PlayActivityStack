package com.example.playactivitystack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PaymentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_payment);
	}
	
	
	public void onButtonClicked(View v){
		switch (v.getId()) {
		case R.id.btReceipt:
			gotoReceipt();
			break;

		default:
			break;
		}
	}


	private void gotoReceipt() {
		Intent intent = new Intent(PaymentActivity.this, ReceiptActivity.class);
//		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent);
	}
}
