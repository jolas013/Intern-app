package org.development.jcc.myapplication_intern;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.development.jcc.myapplication_intern.R.layout.activity_list_view;
import static org.development.jcc.myapplication_intern.R.layout.item_view;

public class ListviewCustomView extends ArrayAdapter<Country> {

    private LayoutInflater layoutInflater;
    private List<Country> country;

    public ListviewCustomView(Context context, List<Country> country) {
        super(context, R.layout.activity_list_view,country);
        this.country = country;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(item_view, parent, false);
        }
            TextView txtItem = convertView.findViewById(R.id.txtView);
            ImageView imageView = convertView.findViewById(R.id.mImageView);

            Country countryItems = country.get(position);

            txtItem.setText(countryItems.getCountryname());
            InputStream inputStream = null;

            try {
                String imageFile = countryItems.getImage();
                inputStream = getContext().getAssets().open(imageFile);
                Drawable drawable = Drawable.createFromStream(inputStream, null);
                imageView.setImageDrawable(drawable);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        return convertView;
    }
}


