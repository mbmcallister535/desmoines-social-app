package com.testapp.earleyneverlate.dmsc;

import android.os.Bundle;
import android.view.View;


public class SelectOptions extends android.app.Activity {
    private android.widget.Button my_button;
    private android.widget.EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_options);

        my_button = (android.widget.Button) findViewById(R.id.button);
        my_button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
          public void onClick(View v){
                android.util.Log.v("CS188", "Next is Home Pg");
                android.widget.Toast.makeText(SelectOptions.this,
                        "Hello", android.widget.Toast.LENGTH_LONG).show();
                String input = edit_text.getText().toString();

                android.content.Intent intent = new android.content.Intent
                        (SelectOptions.this,SearchBar.class);
                        startActivity(intent);
            }
        });
    }
}
