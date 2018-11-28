package org.development.jcc.myapplication_intern;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class FragmentDemo2 extends Fragment {
    List<Country> country = StaticData.countries;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.second_fragment,container,false);
        ListView listView = view.findViewById(R.id.lView);
        TextView txtAdapt = view.findViewById(R.id.txtView );
        ImageView image = view.findViewById(R.id.mImageView);

        ListviewCustomView adapter = new ListviewCustomView(getContext(), country);
        listView.setAdapter(adapter);

        return view;
    }
}

