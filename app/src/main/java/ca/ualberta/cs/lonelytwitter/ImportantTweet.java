/*
 *  Copyright (c)2018. CMPUT301 University of Alberta - All Rights Reserved.
 *  You may use, distribute, or modify this code under terms and conditions of
 *  the Code of Student Behaviour at University of Alberta. You can find a
 *  copy of the license in this project.
 *  Otherwise please contact contact@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kevingordon on 2018-01-17.
 */

import java.util.Date;

/**
 * Represents a tweet with isImportant method returning true.
 *
 * @author kevingordon
 * @see NormalTweet
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs the tweet.
     */
    ImportantTweet() {};

    /**
     * Constructs the tweet with a message.
     * @param message tweet message
     */
    ImportantTweet(String message) {
        super(message);
    }

    /**
     * Constructs the tweet with a message and date.
     * @param message tweet message
     * @param date tweet date
     */
    ImportantTweet(String message, Date date) {
        super(message, date);
    }


    /**
     * Is the tweet is important?
     *
     * @return True, this is an important tweet.
     */
    public boolean isImportant() {
        return true;
    }

    /**
     * We wrote this in class.
     *
     * @return This method always returns "HI!". It's friendly, if a little
     * overbearing.
     */
    public String getMessage(){
        return "HI!";
    }

}
