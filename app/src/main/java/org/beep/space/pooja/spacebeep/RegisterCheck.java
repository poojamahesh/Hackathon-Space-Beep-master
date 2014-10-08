package org.beep.space.pooja.spacebeep;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;

public class RegisterCheck extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_check);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {

                mTextView = (TextView) stub.findViewById(R.id.text);
                Button buttons = (Button) stub.findViewById(R.id.button4);


            }
        });
    }

    public void spaceBeepClicked (View target){
        Intent intent = new Intent(RegisterCheck.this, org.beep.space.pooja.spacebeep.Space.class);
        startActivity(intent);
    }

    public void scrambleClicked (View target){

    }

    private boolean isMember() {
        return false;
    }
}