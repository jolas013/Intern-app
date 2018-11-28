package org.development.jcc.myapplication_intern;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class LoginActivity extends Activity {
    private EditText edituser;
    private EditText editpass;
    private TextView txtview;
    Button btnLogin;

    private ArrayAdapter<String> mAdapter;

    private ListView mDrawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
        edituser = (EditText) findViewById(R.id.user);
        editpass = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        mDrawerList = (ListView) findViewById(R.id.navList);
        txtview = (TextView) findViewById(R.id.txtview);
        addDrawerList();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("login_key",edituser.getText().toString());
                intent.putExtra("pw_key",editpass.getText().toString());
                startActivity(intent);


            }
        });
        txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addDrawerList() {
        final String[] osArray = {"Login", "Register","ListView Activity","RecyclerView Activity","Image"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);


        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent m2 = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(m2);
                } else if (position == 2) {
                    Intent intent = new Intent(LoginActivity.this, ListViewActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(LoginActivity.this, RecyclerViewActivity.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(LoginActivity.this, Image.class);
                    startActivity(intent);
                }
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main2,menu);
        return super.onCreateOptionsMenu(menu);
    }
}










