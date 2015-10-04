package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

	/************************************************
	 *	ASSIGNMENT:
	 *	Fix code and comments below this block
	/************************************************/

	public static void main(String [] args) {
	
        int MagicNumber = WorstPractices.animals(false);
        MagicNumber *= 5;
        
        if (MagicNumber > 18) {
            while (MagicNumber > 0)
            {
	
                MagicNumber--;
            }
        }
	}

/* animals
 * @param yesWellHereTheThing helps generate the MagicNumber
 * @return MagicNumber
 */

private static int animals(boolean yesWellHeresTheThing)
{
		/*
			Start off with one of these
		*/
	int aInt = yesWellHereTheThing ? 34 : 21;
	float sparklesFairy = .5f;
    
        for (int brown = 0; brown < aInt; brown++) {
            sparklesFairy *= aInt;
        }
    
        return (int) sparklesFairy * aInt;
}

	/************************************************
	 *	ASSIGNMENT
	 *	Fix code and comments above this block
	/************************************************/
}
