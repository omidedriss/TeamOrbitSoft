package com.orbitsoft.teamorbitsoft.example;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.widget.Toast;

public class MyService extends Service {
    int i,x;
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
//        try {
//            Thread.sleep(5000);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        new Handler(Looper.getMainLooper()).post(new Runnable() {

            @Override
            public void run() {
                for (i = 5; i < 8; i++) {
                    int z = x * i;
// Integer.toString(z);
                    Toast.makeText(MyService.this.getApplicationContext(),String.valueOf(z),Toast.LENGTH_SHORT).show();
                }}
        });
       // return START_STICKY;
       // return START_REDELIVER_INTENT;
        return START_NOT_STICKY;
    }
}