package com.penta.frontrearswitch;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by linyueyang on 3/11/17.
 */

public class MyApplication extends Application {

    public int count = 0;

    @Override
    public void onCreate() {
        super.onCreate();

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {

            @Override
            public void onActivityStarted(Activity activity) {
                Log.v("penta", activity + "==onActivityStarted");
                count++;
                if (count == 1) {
                    Log.v("penta", "=====切到前台=====");
                    Toast.makeText(MyApplication.this,"切到前台",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onActivityStopped(Activity activity) {
                Log.v("penta", activity + "==onActivityStopped");
                count--;
                if (count == 0) {
                    Log.v("penta", "=====切到后台====");
                    Toast.makeText(MyApplication.this,"切到后台",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }


            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }

}
