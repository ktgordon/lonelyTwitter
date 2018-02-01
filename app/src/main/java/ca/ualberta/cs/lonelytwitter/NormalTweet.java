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
 * Represents a tweet with isImportant method returning false.
 *
 * @author kevingordon
 * @see Tweet
 * @see ImportantTweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs the tweet.
     */
    NormalTweet() {};

    /**
     * Constructs the tweet with a message.
     * @param message the message
     */
    NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs the tweet with a message and date.
     * @param message the message
     * @param date the date
     */
    NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Is the tweet is important?
     *
     * @return False, this is not an important tweet.
     */
    public boolean isImportant(){
            return false;
        }


}
