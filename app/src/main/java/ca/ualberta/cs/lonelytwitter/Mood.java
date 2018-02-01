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
 * Represent a mood.
 *
 * @author kevingordon
 * @see Moodiness
 * @see Happy
 * @see Excited
 */
public abstract class Mood implements Moodiness{
    private Date date;

    /**
     * Creates a mood object.
     * Sets the mood date.
     */
    public Mood() {
        this.date = new Date();
    }

    /**
     * Creates a mood object with specified date.
     *
     * @param date mood date
     */
    public Mood(Date date) {
        this.date = date;
    }

    /**
     * Sets the mood date.
     *
     * @param date mood date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the mood date.
     *
     * @return mood date.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Method that returns a string representation of this mood.
     * To be implemented in children classes.
     * @return
     */
    public abstract String format();

}
