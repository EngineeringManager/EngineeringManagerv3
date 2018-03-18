package com.dexterlabs.khand.engineeringmanager.firstYear;

/**
 * Created by khand on 11-02-2018.
 */

public class generalPickerList {

    String year,item1,item2,item3;

    int position;

    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }

    public String getYear() {
        return year;
    }

    public generalPickerList(String year, String item1, String item2, String item3, int position) {
        this.year = year;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
