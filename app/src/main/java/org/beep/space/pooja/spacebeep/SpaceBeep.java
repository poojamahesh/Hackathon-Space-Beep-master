package org.beep.space.pooja.spacebeep;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SpaceBeep extends Activity {

    // public static final String PREFS = "org.beep.space.pooja.spacebeep";
    //public static final String PREFS_DIMMED_KEY = "dimmed";

    private TextView textView;
    private Handler handler;
    private View rootView;
    private View layoutView;
    private IntentFilter timeFilter;
    private IntentFilter timeTickFilter;
    private IntentFilter timeZoneFilter;
    private BroadcastReceiver timeUpdateReceiver;

    int hour = 0;
    int minutes = 0;
    //private int ANIMATION_INTERVAL = 950;

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_beep);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);


        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                textView = (TextView) stub.findViewById(R.id.text);


                Button buttons = (Button) stub.findViewById(R.id.button5);
                 buttons = (Button) stub.findViewById(R.id.button2);

            }
        });
    }

    public void buttonPlayClicked (View target){

        Intent intent = new Intent(SpaceBeep.this, Space.class);
        startActivity(intent);
    }

    public void buttonRegisterClicked (View target){
        Intent intent = new Intent(SpaceBeep.this, RegisterCheck.class);
        startActivity(intent);
    }

    private boolean isMember() {
        return false;
    }
}





