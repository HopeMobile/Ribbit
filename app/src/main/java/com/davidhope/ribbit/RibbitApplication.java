package com.davidhope.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by David on 8/24/2015.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "8EaEz9oGK5tQIgyM2eM4cA9PFDtz8Q3O6huq6Ph7", "7DfQcWX7unrSXnbZXvkVNRVcbVr291SJPsLMB7ju");


    }
}
