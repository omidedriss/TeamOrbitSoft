package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.MyBrowserActivity;

public class saeidianBrowser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidianbrowser);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            Long hotelName = bundle.getLong("testputLong",12);
        }

        Uri url = getIntent().getData();
        Toast.makeText(this, ""+url.toString(), Toast.LENGTH_SHORT).show();

        WebView webView = (WebView) findViewById(R.id.sh);


        webView.setWebViewClient(new MyBrowserActivity.Callback());
        webView.loadUrl(url.toString());
    }
    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }
}