package com.orbitsoft.teamorbitsoft.example.RestAPI;


import android.app.Dialog;

import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 1/26/2018.
 */

public class ServiceGenerator {

    public static final String URL = "https://pillva.com/";
  // public static final String URL = "http://87.236.209.116:1000/";

    private TaskService apiService;
    public static int MethodSend;
    public static HttpUrl reTest;
    public static   Dialog dialog;
    public Runnable runnable;
    Handler testt=     new Handler(Looper.getMainLooper());



    public ServiceGenerator()
    {




        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                Request request = original.newBuilder()
                        .header("Content-Type", "application/json")

              //  .header("Content-Type","application/json")
                // connection.addRequestProperty("User-Agent","application/json");
                .header("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36")
                .header("Host","pillva.com")
                .header("Content-Length","170")
                .header("accept","pplication/json, text/plain, */*")

                      //  .header("Content-Type", "application/x-www-form-urlencoded")
//                        .header("Authorization", "Bearer "+Helper.Token)

                        .method(original.method(), original.body())

                        .build();

                return chain.proceed(request);
            }
        });




        final OkHttpClient okHttpClient = httpClient
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)

.addInterceptor(new Interceptor() {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();


       try {
           Response   response = chain.proceed(request);


           if (response.code() != 200) {
               if (response.code() == 401)
               {
                   reTest=  response.request().url();


                   StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

                   StrictMode.setThreadPolicy(policy);
               }else {

                   try {

                       runnable = new Runnable() {
                           @Override
                           public void run() {
                               try {
//                    Intent i = new Intent(G.context,ErrorHandlingActivity.class);
//
//                    G.context.startActivity(i);

                                   //   if (ErrorHandlingActivity.Instance ==null){

//                                   G.ErrorCode =2;
//                                   dialog = new ErrorHandlingActivity(G.activity);
//                                   dialog.show();

                                   // ErrorHandlingActivity.Instance.dismiss();
                                   //      }

//                    try {
//                   //     Thread.sleep(2000);
//                    }catch (Exception e){
//
//                    }
//                    else {
//                        Dialog dialog = new ErrorHandlingActivity(G.activity);
//                        dialog.show();
//                    }

                                   //     ErrorHandlingActivity.Instance.layout.addView(Progress.start(G.context));
                               }catch (Exception e){

                                   Log.d("", "");
                               }
                           }
                       };

                       testt.post(runnable);
//                       Intent i = new Intent(G.context,ErrorHandlingActivity.class);
//                       G.context.startActivity(i);
//                       Dialog dialog = new ErrorHandlingActivity(G.context);
//                       dialog.show();
                   }catch (Exception e){

                   }

               }

               Log.d("","");

           }else {


           }
           return response;

       }catch (Exception e){

           try {



               return new Response.Builder().build();
           }catch (Exception ee){

           }


           Response   response2 = chain.proceed(request);
           return response2 ;

       }


    }
})
                .build();


        Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)

                .build();

        apiService = restAdapter.create(TaskService.class);
    }



    public TaskService getService()
    {
        return apiService;
    }
}
