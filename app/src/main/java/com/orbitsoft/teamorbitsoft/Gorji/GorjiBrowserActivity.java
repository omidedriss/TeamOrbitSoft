package com.orbitsoft.teamorbitsoft.Gorji;



import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class GorjiBrowserActivity extends AppCompatActivity {
WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji_browser);
        web=findViewById(R.id.webview);
        Bundle bl = getIntent().getExtras();
            if(bl!=null){
                Long hotelName = bl.getLong("testputLong",12);
            }
        Uri url = getIntent().getData();
        Toast.makeText(this, ""+url.toString(), Toast.LENGTH_SHORT).show();

        web.setWebViewClient(new Callback());
        web.loadUrl(url.toString());
    }
    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {return false;
        }
    }
}