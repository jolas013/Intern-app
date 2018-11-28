package org.development.jcc.myapplication_intern;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class ListviewImage extends AppCompatActivity {
        ImageView mImage;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_image);
        mImage = (ImageView) findViewById(R.id.mImageView);

    }
}


