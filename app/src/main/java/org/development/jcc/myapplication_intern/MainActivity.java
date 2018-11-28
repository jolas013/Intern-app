package org.development.jcc.myapplication_intern;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    public static String message;
    private ListView mDrawerList;
    private TextView txtuser;
    TextView txtpass;
    private ArrayAdapter<String> mAdapter;
    List<Country> country = StaticData.countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerList = (ListView) findViewById(R.id.navList);
        txtuser = (TextView) findViewById(R.id.txtUsername);
        txtpass = (TextView) findViewById(R.id.txtPassword);

        for (Country country :
                country) {
            Toast.makeText(this, country.countryname, Toast.LENGTH_LONG).show();
            Log.i("COUNTRY:", country.countryname);
        }

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String username = bundle.getString("login_key", null);
            String password = bundle.getString("pw_key", null);
            txtuser.setText(username);
            txtpass.setText(password);
            Toast.makeText(getApplicationContext(), "Username: " + username + "\n" +
                    "Password: " + password, Toast.LENGTH_LONG).show();
        }

        addDrawerItems();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main2, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.accSet) {
            Intent intent = new Intent(this, AccountSettingActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.logout) {
            MainActivity.this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void addDrawerItems() {
        final String[] osArray = {"Login", "Register", "ListView Activity", "RecyclerView Activity", "Image","Fragments"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);


        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent m2 = new Intent(MainActivity.this, RegisterActivity.class);
                    startActivity(m2);
                } else if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(MainActivity.this, Image.class);
                    startActivity(intent);
                }else if (position == 5){
                    Intent intent = new Intent(MainActivity.this,Fragments.class);
                    startActivity(intent);
                }

            }

        });

    }

}
