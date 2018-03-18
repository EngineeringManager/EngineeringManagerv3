package com.dexterlabs.khand.engineeringmanager.ThirdYear;

/**
 * Created by khand on 19-02-2018.
 */

public class QuestionPaperTEList {
    public String subject;
    private int position;

    public QuestionPaperTEList(String subject, int position) {
        this.subject = subject;
        this.position=position;
    }

    public String getSubject() {
        return subject;
    }

    public int getPosition() {
        return position;
    }
}
