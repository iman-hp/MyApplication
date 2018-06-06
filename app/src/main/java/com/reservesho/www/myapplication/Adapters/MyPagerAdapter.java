package com.reservesho.www.myapplication.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.reservesho.www.myapplication.Fragments.Introduction1_Fragment;
import com.reservesho.www.myapplication.Fragments.Introduction2_Fragment;
import com.reservesho.www.myapplication.Fragments.Introduction3_Fragment;
import com.reservesho.www.myapplication.Fragments.Introduction4_Fragment;

/**
 * Created by Iman on 6/6/2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {


    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
  if (position==0)
      return Introduction1_Fragment.getinstance();
  else if (position==1)
      return Introduction2_Fragment.getinstance();
            else if(position==2)
      return Introduction3_Fragment.getinstance();
            else if (position==3)
      return Introduction4_Fragment.getinstance();
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
