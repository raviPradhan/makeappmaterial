package com.example.xyzreader.customwidgets;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class CustomCondensedTextView extends AppCompatTextView {

    public CustomCondensedTextView(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public CustomCondensedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public CustomCondensedTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("RobotoCondensed-Regular.ttf", context);
        setTypeface(customFont);
    }
}
