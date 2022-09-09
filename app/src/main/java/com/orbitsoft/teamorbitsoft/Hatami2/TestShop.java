package com.orbitsoft.teamorbitsoft.Hatami2;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class TestShop extends AppCompatActivity implements TestShopp {
    WebHandler webApiHandler;
    RecyclerView rcMain;
    EditText edSearch;
    static ArrayList<Product> productArrayList=new ArrayList<>();
    static ArrayList<Product> productArrayListFilter=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shop);
        rcMain=findViewById(R.id.rcMain);
        edSearch=findViewById(R.id.edSearch);
        webApiHandler = new WebHandler(this);
        webApiHandler.apiConnect();
        rcMain.addOnItemTouchListener(new RecyclerTouchListener(this, rcMain, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                ProductActivity.product = productArrayList.get(position);
                startActivity(new Intent(TestShop.this,ProductActivity.class));
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        edSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                search(editable.toString().trim().toLowerCase());
            }
        });
    }

    private void search(String searachvalue) {
        productArrayListFilter.clear();
        for (Product product : productArrayList) {
            if (product.getName().toLowerCase().contains(searachvalue)){
                productArrayListFilter.add(product);
            }
        }
        Adapter adapter = new Adapter(this,productArrayListFilter);
        rcMain.setAdapter(adapter);
    }

    @Override
    public void senData() {
        // Linear Recycler View
        Adapter adapter = new Adapter(this,productArrayList);
        rcMain.setLayoutManager(new LinearLayoutManager(this));
        rcMain.setItemAnimator(new DefaultItemAnimator());
        rcMain.setAdapter(adapter);

//        // Grid Layout Recycler View
//        Adapter adapter = new Adapter(this,productArrayList);
//        rcMain.setLayoutManager(new GridLayoutManager(this,2));
//        rcMain.setItemAnimator(new DefaultItemAnimator());
//        rcMain.setAdapter(adapter);
    }
}