package com.orbitsoft.teamorbitsoft.Hatami2;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class WebHandler {
    Context context;
    String apiLink = "";
    ArrayList<Product> productArrayList = new ArrayList<>();

    public WebHandler(Context context) {
        this.context = context;
    }

    void apiConnect() {
        if ("getproducts".equals("getproducts")) {
            apiLink = Config.getProductWebApi;
        }
        ProgressDialog progressDialog = ProgressDialog.show(context, "connecting", "please wait"
                , false, false);
        StringRequest request = new StringRequest(Request.Method.POST
                , apiLink, response -> {
            showJson(response);
            progressDialog.dismiss();
            //                Toast.makeText(context, response, Toast.LENGTH_SHORT).show();
        }, error -> {
            Toast.makeText(context, error.getMessage(), Toast.LENGTH_SHORT).show();
            progressDialog.dismiss();
        });
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(request);
    }

    private void showJson(String response) {
        productArrayList.clear();
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("response");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                String id = jsonObject1.getString("id");
                String name = jsonObject1.getString("name");
                String description = jsonObject1.getString("description");
                String price = jsonObject1.getString("price");
                String photo = jsonObject1.getString("photo");
                Product p = new Product(id,name,description,price,photo);
                productArrayList.add(p);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        TestShop.productArrayList=productArrayList;
        IData iData = (IData) context;
        iData.senData();
    }
}
