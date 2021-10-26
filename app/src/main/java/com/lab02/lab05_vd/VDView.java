package com.lab02.lab05_vd;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class VDView extends View {

    Paint textPaint;

    public VDView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void init(){
        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(5);
    }
}
