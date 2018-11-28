package org.development.jcc.myapplication_intern;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  {
    List<Country> countries;
    private LayoutInflater layoutInflater;
    Context context;

    public Adapter(List<Country> countries, Context context) {
        this.countries = countries;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item_view,viewGroup,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Country country = countries.get(i);
        viewHolder.txtadapt.setText(country.getCountryname());
        InputStream inputStream = null;
        try {
            String imageFile = country.getImage();
            inputStream = context.getAssets().open(imageFile);
            Drawable drawable =Drawable.createFromStream(inputStream,null);
            viewHolder.mImageView.setImageDrawable(drawable);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {

        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtadapt;
        ImageView mImageView;
        RecyclerView recyclerView;
        public ViewHolder(View view){
            super(view);
            txtadapt = (TextView)view.findViewById(R.id.txtRecyclerAdapter);
            mImageView = (ImageView)view.findViewById(R.id.imageRecyclerView);
            recyclerView = (RecyclerView)view.findViewById(R.id.recycler);

        }

    }
}