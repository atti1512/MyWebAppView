package com.example.mywebviewapp;

import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.net.Uri;






/**
 * Created by locle on 1/23/14.
 */
public class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("html5rocks.com")) {
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
