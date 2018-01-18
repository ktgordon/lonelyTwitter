package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kevingordon on 2018-01-17.
 */

import java.util.Date;

public class NormalTweet extends Tweet {

        NormalTweet() {};

        NormalTweet(String message) {
            super(message);
        }

        NormalTweet(String message, Date date) {
            super(message, date);
        }

        public boolean isImportant(){
            return false;
        }


}
