package org.development.jcc.myapplication_intern;

import android.app.Activity;
import android.content.Intent;
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
    public static String message;

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
            String msg = editUser.getText().toString();
            String msg1 =editPass.getText().toString();
            String msg2 = editEmail.getText().toString();
            Intent intent = new Intent(RegisterActivity.this,toastBundle.class);
            intent.putExtra(message,msg);
            intent.putExtra(message,msg1);
            intent.putExtra(message,msg2);

            Bundle bundle = new Bundle();
            bundle.putString("",msg);
            bundle.putString("",msg1);
            bundle.putString("",msg2);
            String toast = "Username: " + msg + "Password: " + msg1 + "Email: " + msg2;
            Toast.makeText(RegisterActivity.this,toast , Toast.LENGTH_LONG).show();
            startActivity(intent);
            }
        });
    }
}
