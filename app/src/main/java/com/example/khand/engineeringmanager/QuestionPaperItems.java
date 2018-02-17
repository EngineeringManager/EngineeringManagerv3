package com.example.khand.engineeringmanager;

import java.util.List;

/**
 * Created by khand on 11-02-2018.
 */

public class QuestionPaperItems {

    private String year;
    int position;

    public QuestionPaperItems(String year, int position) {
        this.year = year;
        this.position=position;
    }



    public String getYear() {
        return year;
    }

    public int getPosition() {
        return position;
    }
}
