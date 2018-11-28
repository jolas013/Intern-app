package org.development.jcc.myapplication_intern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    private ArrayAdapter<String> mAdapter;
    private ListView mlistView;
    List<Country> country = StaticData.countries;

    ListView mDrawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_list_view);

        mlistView = (ListView) findViewById(R.id.lView);
        ListviewCustomView adapter = new ListviewCustomView(this, country);
        mlistView.setAdapter(adapter);
        addDrawerItems();


    }

    private void addDrawerItems() {
        final String[] osArray = {"Login", "Register", "RecyclerView Activity", "Image","Fragmnets"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(ListViewActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent m2 = new Intent(ListViewActivity.this, RegisterActivity.class);
                    startActivity(m2);
                } else if (position == 4) {
                    Intent intent = new Intent(ListViewActivity.this, Fragments.class);
                    startActivity(intent);


                } else if (position == 2) {
                    Intent intent = new Intent(ListViewActivity.this, RecyclerViewActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(ListViewActivity.this, Image.class);
                    startActivity(intent);

                }

            }

        });

    }
}
