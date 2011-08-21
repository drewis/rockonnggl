package org.abrantix.rockon.rockonnggl;

import org.abrantix.rockon.rockonnggl.cm.R;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;


public class AdsenseStuff {

    /**
     * Initialize the ads
     */
    static void initAdSense(Activity act)
    {
        //Lets not show the ads
        hideAdsAndDonation(act);
    }
    
    /**
     * Hide the Adsense view 
     */
    static void hideAdsAndDonation(Activity act)
    {
    	TextView tv = (TextView)act.findViewById(R.id.donate_button);
    	tv.setVisibility(View.GONE);
    }
}
