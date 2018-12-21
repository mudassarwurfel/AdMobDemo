package wurfel.com.admobdemo;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by ${Muddassar} on 12/21/2018.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.Admob_App_id));
    }
}
