package com.aidl.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TestService extends Service {
    public TestService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        String str = "bbb";
        return null;
    }
}
