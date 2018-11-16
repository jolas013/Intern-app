package org.development.jcc.myapplication_intern;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<String> month;
    Context context;

    public Adapter(List<String> month, Context context) {
        this.month = month;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycleradapter,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtadapt.setText((String) month.get(i));
    }

    @Override
    public int getItemCount() {

        return month.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtadapt;
        public ViewHolder(View view){
            super(view);
            txtadapt = (TextView)view.findViewById(R.id.txtRecyclerAdapter);

        }

    }
}
