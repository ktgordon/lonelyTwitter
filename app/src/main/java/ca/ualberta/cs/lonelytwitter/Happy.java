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

/**
 * Gives mood a happy flair.
 * @author kevingordon
 * @see Mood
 * @see Excited
 */
public class Happy extends Mood {
    /**
     * String representation of this mood.
     * @return String indicating this mood is happy.
     */
    public String format(){
        return "I'm so happy!";
    }
}
