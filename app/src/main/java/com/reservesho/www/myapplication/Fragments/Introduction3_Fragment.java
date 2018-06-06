package com.reservesho.www.myapplication.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.reservesho.www.myapplication.R;

/**
 * Created by Iman on 6/6/2018.
 */

public class Introduction3_Fragment extends Fragment {
    //singletone
    public static Introduction3_Fragment fragment;
    public static Introduction3_Fragment getinstance(){
        if (fragment==null)
            fragment= new Introduction3_Fragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.introduction3_fragment_layout,container,false);
        Button btn_next3=v.findViewById(R.id.btn_next3);
        TextView txt_skip=v.findViewById(R.id.txt_skip);
        return v;
    }
}
