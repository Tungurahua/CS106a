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
		goLowerLeftCorner();
		findCenter();
	}
	
	private void goLowerLeftCorner() {
		// TODO Auto-generated method stub
		goSouth();
		goWest();
		faceEast();
		
	}

	private void goWest() {
		// TODO Auto-generated method stub
		faceWest();
		while(frontIsClear()){
			move();
		}
	}

	private void goSouth() {
		// TODO Auto-generated method stub
		faceSouth();
		while(frontIsClear()){
			move();
		}

	}

	private void faceWest() {
		// TODO Auto-generated method stub
		while(notFacingWest()){
			turnRight();
		}
	}

	private void findCenter(){
		moveUpAcross();
		faceSouth();
		moveDown();
		faceEast();
	}
	private void faceEast() {
		// TODO Auto-generated method stub
		while(notFacingEast()){
			turnRight();
		}
	}
	private void moveUpAcross() {
		// TODO Auto-generated method stub
		while(frontIsClear()){
			move();
			turnLeft();
			move();
			turnRight();
		}
	}
	private void moveDown() {
		// TODO Auto-generated method stub
		while(frontIsClear()){
			move();
			move();
			turnRight();
			move();
			turnLeft();
		}
	}
	private void faceSouth() {
		// TODO Auto-generated method stub
		while(notFacingSouth()){
			turnRight();
		}
	}
	
}