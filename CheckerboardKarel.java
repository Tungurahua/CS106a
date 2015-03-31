/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	// You fill in this part
	public void run(){
		goBottomLeft();
		fillFirstRow();
		fillRemainingRows();
		fillInnerRows();
		fillTopRow();
		//rowUp();
		//moveWest();
		//faceEast();
		//testIfTop();
		//makeCheckerRow();
	}

	private void fillRemainingRows() {
		// TODO Auto-generated method stub
		
	}

	private void fillInnerRows() {
		// TODO Auto-generated method stub
		while(frontIsClear()){
			moveWest();
			while(frontIsClear()){
				fillOtherThanBelow();
				}
			faceNorth();
		}
		
	}

	private void fillOtherThanBelow() {
		// TODO Auto-generated method stub
		faceSouth();
		move();
		if(beepersPresent()){
		faceNorth();
		move();
		}else{
			faceNorth();
			move();
			putBeeper();			
		}
		faceEast();
	}

	private void fillFirstRow() {
		// TODO Auto-generated method stub
		while(frontIsClear()){
		putBeeper();
		if(frontIsClear()){move();}
		if(frontIsClear()){move();}
		faceNorth();
		}
	}

	private void goBottomLeft() {
		/** From anywhere in the world, move Karel 
		 * to the bottom left corner and face east 
		 */
		moveSouth();
		moveWest();
		faceEast();
	}
	
	// Move until meet a wall methods
	private void moveSouth() {
		// TODO Auto-generated method stub
		faceSouth();
		while(frontIsClear()){
			move();
		}
	}
	private void moveWest() {
		// TODO Auto-generated method stub
		faceWest();
		while(frontIsClear()){
			move();
		}
	}

	// Turn Karel to face in a direction
	private void faceSouth() {
		// TODO Auto-generated method stub
		while(notFacingSouth()){
			turnLeft();
		}
	}
	private void faceWest() {
		// TODO Auto-generated method stub
		while(notFacingWest()){
			turnLeft();
		}
	}
	private void faceEast() {
		// TODO Auto-generated method stub
		while(notFacingEast()){
			turnLeft();
		}
	}
	private void faceNorth() {
		// TODO Auto-generated method stub
		while(notFacingNorth()){
			turnLeft();
		}
	}
	
	
}
