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
		rowUp();
		moveWest();
		faceEast();
		makeCheckerRow();
	}

	private void rowUp() {
		// TODO Auto-generated method stub
		faceNorth();
		move();
	}

	private void fillFirstRow() {
		// TODO Auto-generated method stub
		while(frontIsClear()){
		putBeeper();
		if(frontIsClear()){move();}
		if(frontIsClear()){move();}
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
