package com.alexis.myfirstandroidapp.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends Activity{

    private Button button;
    private TextView txtLogin;
    private TextView txtPass;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.new_layout);

            txtLogin = (TextView) findViewById(R.id.textLogin);
            txtPass = (TextView) findViewById(R.id.textPass);

            txtLogin.setText(getIntent().getStringExtra("login"));
            txtPass.setText(getIntent().getStringExtra("pass"));
}
    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
