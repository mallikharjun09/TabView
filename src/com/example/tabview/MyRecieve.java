package com.example.tabview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyRecieve extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
	}

}
