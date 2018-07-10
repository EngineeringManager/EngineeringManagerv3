package com.dexterlabs.khand.engineeringmanager.FourthYear;

import android.content.Context;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

public class BeVidSecondList extends ExpandableListView {


    public BeVidSecondList(Context context) {
        super(context);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(999999, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
