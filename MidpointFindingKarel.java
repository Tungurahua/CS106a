/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {
	public void run(){
		
		// put beepers in corners and stand beside right beeper
		putBeeper();
		while(frontIsClear()){move();}
		putBeeper();
		turnAround();
		move();
		
		// move between beepers until 
		while(frontIsClear()){
			midMove();	
		}
		turnAround();
		while(noBeepersPresent()){move();}

	
	}

	private void midMove(){
		// move until beeper encountered
		while(noBeepersPresent()){
				clearMove();
			
		pickBeeper(); // pick it up
		turnAround(); // turn around
		clearMove(); // move
		putIfEmpty(); // put new beeper
		clearMove(); //move
		}
	}

	private void putIfEmpty(){
		if(noBeepersPresent()){
			putBeeper();
		}
	}
	
	private void faceSouth(){
		if(notFacingSouth()){turnLeft();}
	}

	private void clearMove(){
		if(frontIsClear()){move();}
	}

}