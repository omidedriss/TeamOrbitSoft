package com.orbitsoft.teamorbitsoft.Hatami2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.orbitsoft.teamorbitsoft.R;


public class ProductActivity extends AppCompatActivity {
    TextView txtName,txtDesc,txtPrice;
    static Product product;

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        txtName=findViewById(R.id.txtName);
        txtDesc=findViewById(R.id.txtDesc);
        txtPrice=findViewById(R.id.txtPrice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
//        toolbar.setBackgroundColor(getResources().getColor(R.color.design_default_color_secondary));
        ImageView imageView = toolBarLayout.findViewById(R.id.imgTitle);


        toolBarLayout.setTitle(product.getName());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String htmlText = String.valueOf(Html.fromHtml(product.getDescription()));
        txtName.setText(product.getName());
        txtDesc.setText(htmlText);
        txtPrice.setText(product.getPrice() + " دلار");
    }
}