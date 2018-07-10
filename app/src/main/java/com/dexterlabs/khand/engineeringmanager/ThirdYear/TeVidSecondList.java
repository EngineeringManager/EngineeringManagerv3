package com.dexterlabs.khand.engineeringmanager.ThirdYear;

import android.content.Context;
import android.widget.ExpandableListView;

public class TeVidSecondList extends ExpandableListView {


    public TeVidSecondList(Context context) {
        super(context);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(999999, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
