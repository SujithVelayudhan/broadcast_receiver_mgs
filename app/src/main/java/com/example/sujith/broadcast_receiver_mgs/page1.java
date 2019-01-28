package com.example.sujith.broadcast_receiver_mgs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class page1 extends AppCompatActivity implements MessageListener
{
    TextView txtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        txtp=findViewById(R.id.txt);
        MessageReceiver.bindListener(this);
    }

    @Override
    public void messageReceived(String message)
    {
        txtp.setText(""+message);
        Toast.makeText(this, "New Message Received: " + message,
                Toast.LENGTH_SHORT).show();

    }
}
