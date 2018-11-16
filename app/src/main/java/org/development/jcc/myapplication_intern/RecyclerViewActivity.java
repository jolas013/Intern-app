package org.development.jcc.myapplication_intern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_recycler_view);
        recView = (RecyclerView) findViewById(R.id.recycler);
        ArrayList<String> month = new ArrayList<>(Arrays.asList( "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));g
        recView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(month, this);
        recView.setAdapter(adapter);
    }
}