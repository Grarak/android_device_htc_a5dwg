package com.android.internal.telephony;

import android.content.Context;

public class a5dualsimRIL extends RIL implements CommandsInterface {

    public a5dualsimRIL(Context context, int preferredNetworkType, int cdmaSubscription) {
        this(context, preferredNetworkType, cdmaSubscription, null);
    }

    public a5dualsimRIL(Context context, int preferredNetworkType,
            int cdmaSubscription, Integer instanceId) {
        super(context, preferredNetworkType, cdmaSubscription, instanceId);
        mQANElements = 5;
    }

}
