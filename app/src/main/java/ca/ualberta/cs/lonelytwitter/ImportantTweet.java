package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kevingordon on 2018-01-17.
 */

import java.util.Date;

public class ImportantTweet extends Tweet {


    ImportantTweet() {};

    ImportantTweet(String message) {
        super(message);
    }

    ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public boolean isImportant() {
        return true;
    }

    public String getMessage(){
        return "HI!";
    }

}
