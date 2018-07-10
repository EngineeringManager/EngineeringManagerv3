package com.dexterlabs.khand.engineeringmanager.SecondYear;

import android.content.Context;
import android.widget.ExpandableListView;

public class SeVidSecondList extends ExpandableListView {


    public SeVidSecondList(Context context) {
        super(context);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(999999, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
