package org.beep.space.pooja.spacebeep;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mynotifyactivity extends Activity {

    private TextView mTextView;
    int notificationId=001;
    boolean eventId=true;
    String EXTRA_EVENT_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mynotifyactivity);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
                Intent viewEvent = new Intent(mynotifyactivity.this, SpaceBeep.class);
                startActivity(viewEvent);



                viewEvent.putExtra(EXTRA_EVENT_ID, eventId);
                PendingIntent viewPendingIntent =
                        PendingIntent.getActivity(mynotifyactivity.this, 0, viewEvent, 0);

                NotificationCompat.WearableExtender wearableExtender =
                        new NotificationCompat.WearableExtender()
                                .setHintShowBackgroundOnly(true);

                Notification notificationBuilder =
                        new NotificationCompat.Builder(mynotifyactivity.this)
                                .setSmallIcon(R.drawable.ic_launcher)
                                .setContentTitle("Hello Android Wear")
                                .setContentText("First Wearable notification.")
                                .extend(wearableExtender)
                                .build();

               // NotificationManagerCompat notificationManager =
                    //    NotificationManagerCompat.from(mynotifyactivity.this);



               // notificationManager.notify(notificationId, notificationBuilder);

                wearableExtender = new NotificationCompat.WearableExtender(notificationBuilder);
                boolean hintHideIcon = wearableExtender.getHintHideIcon();

                Button buttons = (Button) stub.findViewById(R.id.button7);

            }
        });
    }

    public void buttonCanPlayClicked (View target){

        Intent intent = new Intent(mynotifyactivity.this, SpaceBeep.class);
        startActivity(intent);
    }
}
