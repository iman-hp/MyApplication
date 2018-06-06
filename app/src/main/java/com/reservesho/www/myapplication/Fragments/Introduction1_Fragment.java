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

public class Introduction1_Fragment extends Fragment {
    //singletone
    public static Introduction1_Fragment fragment;
    public static Introduction1_Fragment getinstance(){
        if (fragment==null)
            fragment= new Introduction1_Fragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.introduction1_fragment_layout,container,false);
        Button btn_next1=v.findViewById(R.id.btn_next);
        TextView txt_skip=v.findViewById(R.id.txt_skip);
        return v;
    }
}
