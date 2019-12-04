/*
Name: CountCharacter
Purpose: Convert a time to seconds.
Author: Luca Cataldo
Date: Dec. 4, 2019
*/

import java.io.*;

public class TotalSeconds
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader keyboardInput = new BufferedReader (new InputStreamReader (System.in));

	System.err.print ("Enter a time: ");
	String time = (keyboardInput.readLine ());

	String timeList = (time);
	String[] parts = timeList.split (":");
	
	int hours = Integer.parseInt(parts[0]);
	int min = Integer.parseInt(parts[1]);
	int sec = Integer.parseInt(parts[2]);
	
	int hourTotal = hours * 3600;
	int minTotal = min * 60;
	
	int finalTotal = hourTotal + minTotal + sec;
	
	System.out.print (finalTotal);
	
    }
}


