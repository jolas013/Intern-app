package org.development.jcc.myapplication_intern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recView;
    private RecyclerView.Adapter adapter;
    List<Country> country = StaticData.countries;
    private ArrayAdapter<String> mAdapter;

    private ListView mDrawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_recycler_view);
        mDrawerList = (ListView) findViewById(R.id.navList);
        recView = (RecyclerView) findViewById(R.id.recycler);
        recView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(country,this);
        recView.setAdapter(adapter);
        addDrawerItems();
    }
    private void addDrawerItems() {
        final String[] osArray = {"Login", "Register", "ListView Activity", "Image", "Fragments"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(RecyclerViewActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent m2 = new Intent(RecyclerViewActivity.this, RegisterActivity.class);
                    startActivity(m2);
                } else if (position == 2) {
                    Intent intent = new Intent(RecyclerViewActivity.this, ListViewActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(RecyclerViewActivity.this, Image.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(RecyclerViewActivity.this, Fragments.class);
                    startActivity(intent);

                }

            }

        });
    }
}