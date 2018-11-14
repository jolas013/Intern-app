package org.development.jcc.myapplication_intern;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class toastBundle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent =getIntent();
        Intent msg = getIntent();
        Intent msg1 = getIntent();
        Intent msg2 = getIntent();
        intent.putExtra("user",msg);
        intent.putExtra("",msg1);
        intent.putExtra("",msg2);
        String msg4 = intent.getStringExtra(RegisterActivity.message);
        String msg5 = intent.getStringExtra(RegisterActivity.message);
        String msg6= intent.getStringExtra(RegisterActivity.message);

        String toast = "Username: " + msg4 + "\n" + "Password: " + msg5 + "\n" + "Email: " + msg6;
        Toast.makeText(this,toast , Toast.LENGTH_LONG).show();

    }
}
