package org.development.jcc.myapplication_intern;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class FragmentDemo extends Fragment {
    List<Country> country = StaticData.countries;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.first_fragment,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        TextView txtAdapt = view.findViewById(R.id.txtRecyclerAdapter);
        ImageView image = view.findViewById(R.id.imageRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Adapter adapter = new Adapter(country,getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}
