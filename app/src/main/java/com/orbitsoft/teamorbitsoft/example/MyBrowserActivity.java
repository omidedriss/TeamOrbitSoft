package com.orbitsoft.teamorbitsoft.example;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class MyBrowserActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            Long hotelName = bundle.getLong("testputLong",12);
        }
        
        Uri url = getIntent().getData();
        Toast.makeText(this, ""+url.toString(), Toast.LENGTH_SHORT).show();

        WebView webView = (WebView) findViewById(R.id.MazWebView01);


        webView.setWebViewClient(new Callback());
        webView.loadUrl(url.toString());
    }
    
    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {return false;
        }
    }    

}
