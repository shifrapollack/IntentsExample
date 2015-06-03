package com.example.shifra.intentsexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void browseWeb(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void showMap(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.6725,86.2553"));
        startActivity(intent);
    }

    public void makeCall(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }
}
