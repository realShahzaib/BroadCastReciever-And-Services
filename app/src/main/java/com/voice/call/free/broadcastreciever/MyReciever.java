package com.voice.call.free.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.TextView;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver
{

    TextView tv;
    public MyReciever(TextView tv) {
this.tv= tv;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        int percentage = intent.getIntExtra("level",0);

            tv.setText(String.valueOf(percentage));
        //}


    }
}
