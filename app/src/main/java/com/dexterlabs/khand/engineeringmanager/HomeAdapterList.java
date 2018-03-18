package com.dexterlabs.khand.engineeringmanager;

/**
 * Created by khand on 15-03-2018.
 */

public class HomeAdapterList
{

        public String subject;
        private int position;

        public HomeAdapterList(String subject, int position) {
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
