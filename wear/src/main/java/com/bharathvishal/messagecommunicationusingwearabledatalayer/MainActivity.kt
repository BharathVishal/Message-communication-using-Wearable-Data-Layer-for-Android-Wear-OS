package com.bharathvishal.messagecommunicationusingwearabledatalayer

import android.content.Context
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import com.google.android.gms.wearable.*

class MainActivity : WearableActivity(), DataClient.OnDataChangedListener,
    MessageClient.OnMessageReceivedListener,
    CapabilityClient.OnCapabilityChangedListener {
    var activityContext: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()
        activityContext = this


    }

    override fun onDataChanged(p0: DataEventBuffer) {
    }

    override fun onMessageReceived(p0: MessageEvent) {
    }

    override fun onCapabilityChanged(p0: CapabilityInfo) {
    }
}
