package org.development.jcc.myapplication_intern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_list_view);
        listView = (ListView)findViewById(R.id.lView);

        String[] array = {"Ph","India","Indonesia","japan","China","US","Russia"};
        arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.txtView,array);
        listView.setAdapter(arrayAdapter);
    }
}
