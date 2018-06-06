package com.reservesho.www.myapplication.Activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.reservesho.www.myapplication.Adapters.MyPagerAdapter;
import com.reservesho.www.myapplication.R;

public class MyPagerActivity extends AppCompatActivity {
ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pager);

        pager=findViewById(R.id.pager);
        MyPagerAdapter pageradapter=new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pageradapter);
    }
}
