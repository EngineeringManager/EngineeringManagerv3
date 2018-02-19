package com.example.khand.engineeringmanager.SecondYear;

/**
 * Created by khand on 19-02-2018.
 */

public class QuestionPaperSEList {

    public String subject;
    private int position;

    public QuestionPaperSEList(String subject, int position) {
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
