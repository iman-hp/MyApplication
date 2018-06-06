package com.reservesho.www.myapplication.CustomViews;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by Iman on 6/6/2018.
 */


public class MyTextViewEnglish extends AppCompatTextView {
    public MyTextViewEnglish(Context context) {
        super(context);
        setTypeFace(context);
    }

    public MyTextViewEnglish(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    void setTypeFace(Context mContext){
        Typeface fontenglish = Typeface.createFromAsset(mContext.getAssets(),"fonts/fontleroybrown.ttf") ;
        this.setTypeface(fontenglish);

    }
}
