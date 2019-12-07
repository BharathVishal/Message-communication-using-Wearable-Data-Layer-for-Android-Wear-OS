package com.bharathvishal.messagecommunicationusingwearabledatalayer

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.wearable.*

class MainActivity : AppCompatActivity(), DataClient.OnDataChangedListener, MessageClient.OnMessageReceivedListener,
CapabilityClient.OnCapabilityChangedListener{
    var activityContext: Context? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityContext=this
    }

    override fun onDataChanged(p0: DataEventBuffer) {
    }

    override fun onMessageReceived(p0: MessageEvent) {
    }

    override fun onCapabilityChanged(p0: CapabilityInfo) {
    }
}
