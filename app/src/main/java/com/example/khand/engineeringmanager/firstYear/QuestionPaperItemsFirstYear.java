
package com.example.khand.engineeringmanager.firstYear;

/**
 * Created by khand on 11-02-2018.
 */

public class QuestionPaperItemsFirstYear {

    public String subject;
    private int position;

    public QuestionPaperItemsFirstYear(String subject, int position) {
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
