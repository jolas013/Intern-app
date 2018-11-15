package org.development.jcc.myapplication_intern;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {
    private EditText editUser;
    private EditText editPass;
    private EditText editEmail;
    Button btnReg;
    String text;
    String u;
    String p;
    String e;
    SharedPreferences.Editor editor;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.register);
        sharedPreferences = getSharedPreferences("user_register", Context.MODE_PRIVATE);

        editUser = (EditText) findViewById(R.id.editUser);
        editPass = (EditText) findViewById(R.id.editPass);
        editEmail = (EditText) findViewById(R.id.editEmail);
        btnReg = (Button) findViewById(R.id.btnRegister);


        u = sharedPreferences.getString("user_reg", "");
        p = sharedPreferences.getString("pw_reg", "");
        e = sharedPreferences.getString("e_reg", "");


        editUser.setText(u);
        editPass.setText(p);
        editEmail.setText(e);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                editor = getSharedPreferences("user_register",MODE_PRIVATE).edit();
                u = editUser.getText().toString();
                p = editPass.getText().toString();
                e = editEmail.getText().toString();

                editor.putString("user_reg", u);
                editor.putString("pw_reg", p);
                editor.putString("e_reg", e);
                editor.apply();
                finish();


            }
        });
    }


}
