package com.dexterlabs.khand.engineeringmanager.FourthYear;

/**
 * Created by khand on 19-02-2018.
 */

public class QuestionPaperBEList {

    public String subject;
    private int position;

    public QuestionPaperBEList(String subject, int position) {
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
