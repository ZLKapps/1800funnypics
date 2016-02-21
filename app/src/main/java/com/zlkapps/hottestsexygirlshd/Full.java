package com.zlkapps.hottestsexygirlshd;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Full extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);

        //Fullscreen
        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setAttributes(attrs);

        //Configure webview
        WebView webview = webview = (WebView)findViewById(R.id.webView2);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.setBackgroundColor(0x00000000);
        webview.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");

        //Load picture from previous activity
        Bundle extras = getIntent().getExtras();
        String link = extras.getString("link");
        webview.loadUrl(link);

    }

}
