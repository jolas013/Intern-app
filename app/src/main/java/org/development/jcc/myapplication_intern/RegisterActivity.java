package org.development.jcc.myapplication_intern;

import android.app.Activity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.register);
        editUser = (EditText)findViewById(R.id.editUser);
        editPass = (EditText)findViewById(R.id.editPass);
        editEmail = (EditText)findViewById(R.id.editEmail);
        btnReg = (Button)findViewById(R.id.btnRegister);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this,"Username: " + editUser.getText().toString()+ "\n"+
                        "Password: "+ editPass.getText().toString()+"\n"+
                        "Email: " + editEmail.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
