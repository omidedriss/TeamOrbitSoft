package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.Model.GetCategoriesProduct;
import com.orbitsoft.teamorbitsoft.example.Model.RefreshToken;
import com.orbitsoft.teamorbitsoft.example.RestAPI.ServiceGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);


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
        Map<String, String> fields = new HashMap<>();
//                   fields.put("username", UserName);
//                   fields.put("password", "1234");

        fields.put("refresh_token", "refreshToken");


        new ServiceGenerator().getService().RefreshToken( fields).enqueue(new Callback<RefreshToken>() {
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