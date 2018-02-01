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

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author kevingordon
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweetable
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    private ArrayList<Mood> thisTweetsMoods;

    /**
     * Constructs a tweet object.
     */
    public Tweet (){};

    /**
     * Constructs a tweet object with a message.
     * @param message tweet message
     */
    public Tweet (String message) {
        this.message = message;
    }

    /**
     * Constructs a tweet object with a message and date.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet (String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Gets the tweet date.
     * @return tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Gets the tweet message.
     * @return tweet message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the tweet message.
     * @param message tweet message
     * @throws TweetTooLongException thrown if the tweet exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException {

        if (message.length() > 160) {
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets the tweet date.
     * @param date tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Is the tweet important. Override in children classes.
     * @return
     */
    public abstract boolean isImportant();

    /**
     * String representation of this tweet.
     * @return tweet message
     */
    public String toString() {
        return message;
    }


}

