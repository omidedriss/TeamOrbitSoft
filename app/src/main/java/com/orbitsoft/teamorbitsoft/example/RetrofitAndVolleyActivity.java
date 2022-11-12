package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.Model.GetCategoriesProduct;
import com.orbitsoft.teamorbitsoft.example.Model.GetItemServer;
import com.orbitsoft.teamorbitsoft.example.Model.RefreshToken;
import com.orbitsoft.teamorbitsoft.example.Model.data;
import com.orbitsoft.teamorbitsoft.example.RestAPI.ServiceGenerator;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.mateware.snacky.Snacky;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitAndVolleyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);


        Button b1= findViewById(R.id.button1);

        ListView listView = (ListView) findViewById(R.id.list_view);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RequestQueue queue = Volley.newRequestQueue(RetrofitAndVolleyActivity.this);
                final String url="https://www.google.com";

                // SettingsMain.showDilog(RegisterNameActivity.Instance);

                JsonObjectRequest jsObjRequest = new JsonObjectRequest
                        (Request.Method.GET, url, null, new com.android.volley.Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                try {
//                            Gson gson = new Gson();
//                            GetItemServer serverResult = new GetItemServer();
//                            //  RegisterItem register = new RegisterItem();
//                            serverResult = gson.fromJson(response.toString(), GetItemServer.class); //convert json String to ServerResult object

                                    Snacky.builder().setActivity(RetrofitAndVolleyActivity.this).setText("ارتباط برقرار شد").build().show();



                                }catch (Throwable e){
                                    Snacky.builder().setActivity(RetrofitAndVolleyActivity.this).setText("خطا در برقراری ارتباط با سرور").build().show();
                                    //    Toast.makeText(RegistrationActivity.Instance,"خطا در برقراری",Toast.LENGTH_SHORT).show();
                                    //   Snacky.builder().setActivity(RegistrationActivity.Instance).setText("لطفا اطلاعات را بدرستی پر کنید").build().show();
                                }

                            }
                        }, new com.android.volley.Response.ErrorListener() {

                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Snacky.builder().setActivity(RetrofitAndVolleyActivity.this).setText("خطا در برقراری ارتباط با سرور").build().show();

                            }
                        });

                queue.add(jsObjRequest);


            }
        });

        Button b2= findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RequestQueue queue = Volley.newRequestQueue(RetrofitAndVolleyActivity.this);
                final String url="https://reqres.in/api/users";

                // SettingsMain.showDilog(RegisterNameActivity.Instance);

                JsonObjectRequest jsObjRequest = new JsonObjectRequest
                        (Request.Method.GET, url, null, new com.android.volley.Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                try {
                            Gson gson = new Gson();
                            GetItemServer serverResult = new GetItemServer();
//                            //  RegisterItem register = new RegisterItem();
                            serverResult = gson.fromJson(response.toString(), GetItemServer.class); //convert json String to ServerResult object

                                    ArrayList<String> name = new ArrayList<>();
                                    for (data d: serverResult.data) {
                                        name.add(d.first_name);
                                    }

                                    ArrayAdapter adapter = new ArrayAdapter<String>(RetrofitAndVolleyActivity.this, R.layout.listview_item,name);

                                    listView.setAdapter(adapter);

                                    Snacky.builder().setActivity(RetrofitAndVolleyActivity.this).setText("ارتباط برقرار شد").build().show();



                                }catch (Throwable e){
                                    Snacky.builder().setActivity(RetrofitAndVolleyActivity.this).setText("خطا در برقراری ارتباط با سرور").build().show();
                                    //    Toast.makeText(RegistrationActivity.Instance,"خطا در برقراری",Toast.LENGTH_SHORT).show();
                                    //   Snacky.builder().setActivity(RegistrationActivity.Instance).setText("لطفا اطلاعات را بدرستی پر کنید").build().show();
                                }

                            }
                        }, new com.android.volley.Response.ErrorListener() {

                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Snacky.builder().setActivity(RetrofitAndVolleyActivity.this).setText("خطا در برقراری ارتباط با سرور").build().show();


                            }
                        });

                queue.add(jsObjRequest);


            }
        });






//        StrictMode.setThreadPolicy(policy);
        new ServiceGenerator().getService().GetCategoriesProduct( ).enqueue(new Callback<List<GetCategoriesProduct>>() {
            @Override
            public void onResponse(Call<List<GetCategoriesProduct>> call, final Response<List<GetCategoriesProduct>> response) {

                Runnable RunnableCategory = new Runnable() {
                    @Override
                    public void run() {

                        try {
//                            dialog.dismiss();
//                            CategoryProductListItems.clear();
//                            CategoryProductListItems = (ArrayList<GetCategoriesProduct>) response.body();
//
//                            if (CategoryProductListItems.size() !=0){
//
//
//                                CategoryProductRecycler.setHasFixedSize(true);
//                                LinearLayoutManager MyLayoutManager = new LinearLayoutManager(CategoryProductActivity.this);
//                                MyLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//                                if (CategoryProductListItems.size() > 0 & CategoryProductRecycler != null) {
//
//                                    adapter = new CategoryProductAdapter(CategoryProductListItems, new RecyclerViewClickListener() {
//
//                                        @Override
//                                        public void recyclerViewListClicked(View v, int position) {
//                                            Log.d("ss","");
//                                        }
//                                    });
//                                    CategoryProductRecycler.setAdapter(adapter);
//                                }
//                                CategoryProductRecycler.setLayoutManager(MyLayoutManager);
//
//                            }else {
//                                setContentView(R.layout.activity_emty);
//                            }
//
//
//
//
//
//

                        }catch (Exception e){

                        }




                    }
                };









            }

            @Override
            public void onFailure(Call<List<GetCategoriesProduct>> call, Throwable t) {
                String a=t.getMessage();
//                dialog.dismiss();
            }
        });
//        Map<String, String> fields = new HashMap<>();
//                   fields.put("username", "omid");
//                   fields.put("password", "1234");
//
//        fields.put("refresh_token", "refreshToken");

String Username="omid";
String Password="1234";

        new ServiceGenerator().getService().RefreshToken( Username,Password).enqueue(new Callback<RefreshToken>() {
            @Override
            public void onResponse(Call<RefreshToken> call, retrofit2.Response<RefreshToken> response) {

                //            test.Set();
//                           try {
//                               Thread.sleep(100);
//                           } catch (InterruptedException e) {
//                               e.printStackTrace();
//                           }
                if (response.body() != null)
                {
//                               Helper.Token=response.body().refresh_token;
//                               FastSave.getInstance().saveString("Token",response.body().refresh_token);
                }


                //reTest.newBuilder();

            }

            @Override
            public void onFailure(Call<RefreshToken> call, Throwable t) {
                String a=t.getMessage();

            }
        });


    }
}