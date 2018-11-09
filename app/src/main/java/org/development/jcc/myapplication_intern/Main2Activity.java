package org.development.jcc.myapplication_intern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private EditText edituser;
    private EditText editpass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    edituser = (EditText)findViewById(R.id.user);
    editpass = (EditText)findViewById(R.id.password);
    btnLogin = (Button)findViewById(R.id.btnLogin);

    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Main2Activity.this,Main7Activity.class);
            startActivity(intent);
        }
    });
    }
}
