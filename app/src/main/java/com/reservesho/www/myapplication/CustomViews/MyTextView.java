package com.reservesho.www.myapplication.CustomViews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by Iman on 6/6/2018.
 */

public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
        setTypeFace(context);
    }

public MyTextView(Context context, AttributeSet attrs){
    super(context, attrs);
}
void setTypeFace(Context mContext){
    Typeface chamran = Typeface.createFromAsset(mContext.getAssets(),"btraffic.ttf") ;
    this.setTypeface(chamran);

}
}
