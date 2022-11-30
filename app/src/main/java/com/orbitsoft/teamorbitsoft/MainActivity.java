package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.appizona.yehiahd.fastsave.FastSave;
import com.orbitsoft.mylibrary.MyLibraryMainActivity;
import com.orbitsoft.teamorbitsoft.Gorji.Gorji;
import com.orbitsoft.teamorbitsoft.Hatami.Hatami;
import com.orbitsoft.teamorbitsoft.Kanani.Kanani;
//import com.orbitsoft.teamorbitsoft.Mazaheri.MazProjects;
//import com.orbitsoft.teamorbitsoft.Mazaheri.MazProjects;


import com.orbitsoft.teamorbitsoft.Moosavi.moosavi_login;
import com.orbitsoft.teamorbitsoft.Nikkhu.Nikkhu;
import com.orbitsoft.teamorbitsoft.Saeidian2.saeidian_login1;
import com.orbitsoft.teamorbitsoft.Salimi.SalimiActivity;
import com.orbitsoft.teamorbitsoft.example.AnimationActivity;
import com.orbitsoft.teamorbitsoft.example.BackgroundServiceActivity;
import com.orbitsoft.teamorbitsoft.example.BroadcastReceiversActivity;
import com.orbitsoft.teamorbitsoft.example.ButtomNavigationActivity;
import com.orbitsoft.teamorbitsoft.example.ButtonActivity;
import com.orbitsoft.teamorbitsoft.example.CheckBoxAndToggleActivity;
import com.orbitsoft.teamorbitsoft.example.CreateContactActivity;
import com.orbitsoft.teamorbitsoft.example.FragmentExampleActivity;
import com.orbitsoft.teamorbitsoft.example.ImageViewActivity;
import com.orbitsoft.teamorbitsoft.example.IntentSample;
import com.orbitsoft.teamorbitsoft.example.LifeCycleActivity;
import com.orbitsoft.teamorbitsoft.example.ListViewActivity;
import com.orbitsoft.teamorbitsoft.example.MapViewActivity;
import com.orbitsoft.teamorbitsoft.example.NotificationActivity;
import com.orbitsoft.teamorbitsoft.example.ProgressBarActivity;
import com.orbitsoft.teamorbitsoft.example.RadioButtonActivity;
import com.orbitsoft.teamorbitsoft.example.RecyclerViewActivity;
import com.orbitsoft.teamorbitsoft.example.MyDialog;
import com.orbitsoft.teamorbitsoft.example.RetrofitAndVolleyActivity;
import com.orbitsoft.teamorbitsoft.example.SavingDataActivity;
import com.orbitsoft.teamorbitsoft.example.SendEmailActivity;
import com.orbitsoft.teamorbitsoft.example.SpinnerActivity;
import com.orbitsoft.teamorbitsoft.example.TextViewActivity;
import com.orbitsoft.teamorbitsoft.example.ThreadAndTryCatchActivity;
//import com.pushpole.sdk.PushPole;


public class MainActivity extends AppCompatActivity {
Button btGorji;
    int numMessages;
   public static MainActivity Instance;
Button btmaz,btMoosavi,btSaeedian,btSaeidian2,btSaeidian2_main,btHatami,btIntent,btLifeCycle,btNickQue,my_dialog,btSalimi,btKanani,TextViewExample,ButtonExample,RecycleView,ListView,Spinner,SavingData,ImageView,CreateContacts,RadioButton,CheckBoxAndToggel,Progress,ThreadAndTry,Animation,MapView,FragmentExample,BottomNavigationButton,retrofit_and_volley,SendEmail,Notification,Module,Service,BroadcastReceivers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Instance=this;
//        PushPole.initialize(this,true);

        FastSave.init(getApplicationContext());
        btNickQue = findViewById(R.id.btNickQue);
        btGorji = findViewById(R.id.btactivity_gorji);
        btmaz=findViewById(R.id.btmaz);
        btMoosavi=findViewById(R.id.moosavi);
        btSaeedian=findViewById(R.id.saeedian);
        //btSaeidian2_main=findViewById(R.id.saeidian2);
        btHatami=findViewById(R.id.hatami);
        btSalimi=findViewById(R.id.Salimi);
        btKanani=findViewById(R.id.Kanani);
        btIntent=findViewById(R.id.intent);
        btLifeCycle=findViewById(R.id.life_cycle);
        my_dialog=findViewById(R.id.my_dialog);
        TextViewExample=findViewById(R.id.text_view);
        ButtonExample=findViewById(R.id.button);
        RecycleView = findViewById(R.id.recycle_view);
        ListView= findViewById(R.id.list_view);
        Spinner= findViewById(R.id.spinner_view);
        SavingData= findViewById(R.id.saving_data);
        ImageView= findViewById(R.id.image);
        CreateContacts=findViewById(R.id.create_contacts);
        RadioButton=findViewById(R.id.radio_button);
        CheckBoxAndToggel=findViewById(R.id.checkbox_toggle);
        Progress=findViewById(R.id.progress);
        ThreadAndTry = findViewById(R.id.thread_try);
        Animation= findViewById(R.id.animation);
        MapView = findViewById(R.id.map_view);
        FragmentExample = findViewById(R.id.fragment);
        BottomNavigationButton=findViewById(R.id.bottom_navigation);
        retrofit_and_volley=findViewById(R.id.retrofit_and_volley);
        SendEmail=findViewById(R.id.send_email);
        Notification=findViewById(R.id.notification);
        Module=findViewById(R.id.module);
        Service=findViewById(R.id.service);
        BroadcastReceivers=findViewById(R.id.broadcast_receivers);
        BroadcastReceivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, BroadcastReceiversActivity.class);
                startActivity(textView);
            }
        });
        Service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, BackgroundServiceActivity.class);
                startActivity(textView);
            }
        });
        Module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, MyLibraryMainActivity.class);
                startActivity(textView);
//                startForegroundService(textView);
            }
        });
        retrofit_and_volley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, RetrofitAndVolleyActivity.class);
                startActivity(textView);
            }
        });


        Notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(textView);
            }
        });

        SendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, SendEmailActivity.class);
                startActivity(textView);
            }
        });
        FragmentExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, FragmentExampleActivity.class);
                startActivity(textView);
            }
        });
        BottomNavigationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, ButtomNavigationActivity.class);
                startActivity(textView);
            }
        });
        MapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, MapViewActivity.class);
                startActivity(textView);
            }
        });
        Animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(textView);
            }
        });
//        ArrayList<Klid> klids = new ArrayList<>();
//        Klid klid = new Klid();
//        klid.name="omid";
//        klids.add(klid);
//        Klid klid2 = new Klid();
//        klid2.name="omid";
//        klids.add(klid2);
//
//        FastSave.getInstance().saveObjectsList("key",klids);

        SharedPreferences sharedpreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("key", "value Test");
        editor.commit();
        TextViewExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(textView);
            }
        });

        ThreadAndTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, ThreadAndTryCatchActivity.class);
                startActivity(textView);
            }
        });
        Progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, ProgressBarActivity.class);
                startActivity(textView);
            }
        });
        RadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, RadioButtonActivity.class);
                startActivity(textView);
            }
        });
        CheckBoxAndToggel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, CheckBoxAndToggleActivity.class);
                startActivity(textView);
            }
        });
        CreateContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textView=new Intent(MainActivity.this, CreateContactActivity.class);
                startActivity(textView);
            }
        });
        ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, ImageViewActivity.class);
                startActivity(textView);
            }
        });
        SavingData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, SavingDataActivity.class);
                startActivity(textView);
            }
        });
        ListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(textView);
            }
        });
        Spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(textView);
            }
        });
        RecycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(textView);
            }
        });
        ButtonExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textView=new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(textView);
            }
        });

        btGorji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gorji = new Intent(getApplicationContext(), Gorji.class);
                startActivity(gorji);
            }
        });

//        btmaz.setOnClickListener(v -> {
//                Intent imaz=new Intent(this, MazProjects.class);
//               startActivity(imaz);
//                }
//        );
        btSaeedian.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, saeidian_login1.class);
                    startActivity(imaz);
                }
        );
//        btSaeidian2_main.setOnClickListener(v -> {
//                    Intent imaz=new Intent(this, saeidian_login1.class);
//                    startActivity(imaz);
//                }
//        );
        btMoosavi.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, moosavi_login.class);
                    startActivity(imaz);
                }
        );
        btHatami.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, Hatami.class);
                    startActivity(imaz);
                }
        );
        btIntent.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, IntentSample.class);
                    startActivity(imaz);
                }
        );
        btLifeCycle.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, LifeCycleActivity.class);
                    startActivity(imaz);
                }
        );
        btNickQue.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, Nikkhu.class);
                    startActivity(imaz);
                }
        );
        btSalimi.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, SalimiActivity.class);
                    startActivity(imaz);
                }
        );
        btKanani.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, Kanani.class);
                    startActivity(imaz);
                }
        );
        my_dialog.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, MyDialog.class);
                    startActivity(imaz);
                }
        );



    }
    @Override
    public void onResume(){
        super.onResume();
        try{
            IntentFilter filter = new IntentFilter("android.provider.telephony.SMS_RECEIVED");
            MyReceiver myReceiver= new MyReceiver();
           registerReceiver(myReceiver,filter);
        }catch (Exception e){
            // already registered
        }
    }
}