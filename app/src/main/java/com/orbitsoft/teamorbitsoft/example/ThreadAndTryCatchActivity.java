package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

import java.io.IOException;

public class ThreadAndTryCatchActivity extends AppCompatActivity {
    boolean boolbtn= false;
    TextView tv1,tv2,tv3;
    Button btn;
    int ii=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_and_try_catch);



        try {


             tv1= findViewById(R.id.tv1);

             tv2= findViewById(R.id.tv2);

             tv3= findViewById(R.id.tv3);

             btn = findViewById(R.id.btnStart);


        }catch (Exception e){

        }
        try {

        }catch (Exception e){




        }
        try {
            int[] list = {1, 2, 3, 4, 5, 6};

            Toast.makeText(ThreadAndTryCatchActivity.this, list[10], Toast.LENGTH_LONG).show();


            ///
        } catch (Exception e) {

            Toast.makeText(ThreadAndTryCatchActivity.this,"Oops!", Toast.LENGTH_LONG).show();
        }

        try {
         int ii= 1/0;
        }

        catch (Exception e) {

            Toast.makeText(ThreadAndTryCatchActivity.this,e.getMessage(), Toast.LENGTH_LONG).show();
        }

        // Assigning Layout elements


                // Boolean for Button (initially False)

        // Button onClick action
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Button (True)
                boolbtn = !boolbtn;
                // Case where Button is False
                if (!boolbtn)
                {
                    tv1.setText("Stopped1");
                    tv2.setText("Stopped2");
                    tv3.setText("Stopped3");
                    btn.setText("Start");
                }
                // Case where Threads are running
                else
                {
                    // Setting the button text as "Stop"
                    btn.setText("Stop");


                    // Thread 1

//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//
//                        }
//                    }).start();
//
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//
//
//
//
//                        }
//                    }).start();

                    new Thread(new Runnable() {
                        @Override
                        public void run() {

                           ii= ii+1;
                           int zz;
                            while (boolbtn) {


                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv1.setText("Started1");
                                    }
                                });
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv1.setText("Activity1");
                                    }
                                });
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                    }).start();


                    // Thread 2
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            // Runs only when Button is
                            // True

                            while (boolbtn) {

                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv2.setText("Started2");
                                    }
                                });
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv2.setText("Activity2");
                                    }
                                });
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                    }).start();


                    // Thread 3


                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            // Runs only when Button is
                            // True

                            ii= ii+1;
                            while (boolbtn) {

                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv3.setText("Started3");
                                    }
                                });
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv3.setText("Activity3");
                                    }
                                });
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                    }).start();


                }
            }
        });

    }
}