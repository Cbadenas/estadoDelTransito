package com.appspot.estadodeltransito.service.receivers;

import com.appspot.estadodeltransito.service.StatusService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
	public static final String ACTION_REFRESH_SUBWAY_ALARM =
		  "com.appspot.estadodeltransito.ACTION_REFRESH_SUBWAY_ALARM";

	public static final String ACTION_REFRESH_ALARM = "ACTION_REFRESH_ALARM";

	@Override
	public void onReceive(Context context, Intent intent) {

		Intent startIntent = new Intent(context, StatusService.class);
		startIntent.setAction(ACTION_REFRESH_ALARM);
		context.startService(startIntent);
	}
}
