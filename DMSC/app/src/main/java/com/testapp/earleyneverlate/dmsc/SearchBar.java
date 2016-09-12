package com.testapp.earleyneverlate.dmsc;

import android.app.Activity;
import android.os.Bundle;

public class SearchBar extends Activity {
    private android.widget.TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bar);

        textView = (android.widget.TextView) findViewById(R.id.textView);

        textView.setText(getIntent().getStringExtra("value"));
    }
}
