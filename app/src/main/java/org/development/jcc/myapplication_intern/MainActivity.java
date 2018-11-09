package org.development.jcc.myapplication_intern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerList = (ListView) findViewById(R.id.navList);
        addDrawerItems();

    }

    private void addDrawerItems() {
        final String[] osArray = {"Login", "Register", "Logout", "Settings", "Email"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);


        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent m2 = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(m2);
                } else if (position == 2) {
                    Intent m3 = new Intent(MainActivity.this, Main4Activity.class);
                    startActivity(m3);
                } else if (position == 3) {
                    Intent m4 = new Intent(MainActivity.this, Main5Activity.class);
                    startActivity(m4);
                } else if (position == 4) {
                    Intent m5 = new Intent(MainActivity.this, Main6Activity.class);
                    startActivity(m5);

                }
            }
        });

    }
}
