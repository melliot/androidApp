package com.alexis.myfirstandroidapp.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{

    private TextView textView;
    private Button button;
    private Button changeLayout;
    private EditText login;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button2);
        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("Hello everybody!!");
            }
        });
    }
    public void sayHello(View view){
        textView.setText("Hello, Alexis!!!!");
    }
    public void changeLayout(View view){
        Intent intent = new Intent(getApplicationContext(), NewActivity.class);

        intent.putExtra("login", login.getText().toString());
        intent.putExtra("pass", password.getText().toString());

        startActivity(intent);
    }
    public void onShow(View view){
        Toast toast = Toast.makeText(this, "Hello", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL, Gravity.CENTER_VERTICAL, Gravity.CENTER);
        toast.show();

    }
}
