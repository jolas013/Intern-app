package org.development.jcc.myapplication_intern;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;

public class Image extends AppCompatActivity {
    ImageView imageView;
    private ArrayAdapter<String> mAdapter;
    ListView mDrawerList;

    ListView mlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        imageView = findViewById(R.id.imgurl);
        mlistView = (ListView) findViewById(R.id.lView);
        AssetManager assetManager = getAssets();


        try {
            String files = "android.png";
            InputStream inputStream = assetManager.open(files);
            Drawable drawable = Drawable.createFromStream(inputStream, "android.png");
            imageView.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        addDrawerItems();
    }

    private void addDrawerItems() {
        final String[] osArray = {"Login", "Register", "RecyclerView Activity", "ListView Activity","Fragments"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Image.this, LoginActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent m2 = new Intent(Image.this, RegisterActivity.class);
                    startActivity(m2);
                } else if (position == 2) {
                        Intent intent = new Intent(Image.this, RecyclerViewActivity.class);
                        startActivity(intent);


                    } else if (position == 3) {
                    Intent intent = new Intent(Image.this, ListViewActivity.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(Image.this, Fragments.class);
                    startActivity(intent);

                }

            }

        });

    }
}
