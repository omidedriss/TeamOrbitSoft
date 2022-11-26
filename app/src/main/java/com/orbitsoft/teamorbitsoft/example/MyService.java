package com.orbitsoft.teamorbitsoft.example;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
        // اینجا کارهایی که نیازه فقط یک بار و موقع ساخته شدن سرویس انجام بشه اجرا میشن
    }
    @Override
    public void onCreate() {
        super.onCreate();
        // اینجا کارهایی که نیازه فقط یک بار و موقع ساخته شدن سرویس انجام بشه اجرا میشن
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // اینجا کارهای مربوط به سرویس استارت شده انجام میشه
        // برای مثال ما فقط 5 ثانیه صبر میکنیم
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // return START_STICKY;
       // return START_REDELIVER_INTENT;
        return START_NOT_STICKY;
    }
}