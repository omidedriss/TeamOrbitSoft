package com.orbitsoft.teamorbitsoft.Mazaheri;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class MazBrowser extends Activity {
    WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazbrowser);

        WebView webView = (WebView) findViewById(R.id.MazWebView01);
        Toast.makeText(this, "sssdfsslf;s", Toast.LENGTH_SHORT).show();
        String siteUrl = "https://www.google.com";
        webView.loadUrl(siteUrl);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(true);

        webView.setWebViewClient(new WebViewClient());

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String Name = bundle.getString("site", "ghj");
        }
        
        Uri url = getIntent().getData();
        Toast.makeText(this, ""+bundle.toString(), Toast.LENGTH_SHORT).show();




     //   webView.setWebViewClient(new Callback());
        webView.loadUrl(bundle.toString());


            class webViewClient extends WebViewClient {

                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {

                    view.loadUrl(url);
                    return true;

                }

                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {

                    Toast.makeText(MazBrowser.this, "Loading page...", Toast.LENGTH_SHORT).show();

                }

                @Override
                public void onPageFinished(WebView view, String url) {

                    Toast.makeText(MazBrowser.this, "Loading finished", Toast.LENGTH_SHORT).show();

                }

            }


            //   private class Callback extends WebViewClient {
            //       @Override
            //       public boolean shouldOverrideUrlLoading(WebView view, String url) {return false;
            //       }
            //   }

        }
    }
