package org.development.jcc.myapplication_intern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Fragments extends AppCompatActivity {
    ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;
    Button btnNext,btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        btnNext = (Button)findViewById(R.id.btnNext);
        btnBack = (Button)findViewById(R.id.btnBack);
        mDrawerList = (ListView) findViewById(R.id.navList);



        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout,new FragmentDemo());
                fragmentTransaction.commit();


            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout,new FragmentDemo2());
                fragmentTransaction.commit();

            }


        });
        addDrawerItems();



    }
    private void addDrawerItems() {
        final String[] osArray = {"Login", "Register", "ListView Activity", "RecyclerView Activity", "Image"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Fragments.this, LoginActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent m2 = new Intent(Fragments.this, RegisterActivity.class);
                    startActivity(m2);
                } else if (position == 2) {
                    Intent intent = new Intent(Fragments.this, ListViewActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(Fragments.this, RecyclerViewActivity.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(Fragments.this, Image.class);
                    startActivity(intent);

                }

            }

        });
    }

}
