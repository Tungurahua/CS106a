/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run(){
		// You fill in this part
		while(frontIsClear()){
			rebuild_column();
			go_home();
			move_right();
		}
		rebuild_column();
	}


	private void face_north(){
		while(notFacingNorth()){
			turnLeft();
		}
	}
	private void face_south(){
		while(notFacingSouth()){
			turnLeft();
		}
	}
	private void face_east(){
		while(notFacingEast()){
			turnLeft();
		}
	}
	
	private void putBeeperIfEmpty(){
		if(noBeepersPresent()){
			putBeeper();
		}

	}

	private void rebuild_column(){
		face_north();
		while(frontIsClear()){
			putBeeperIfEmpty();
			move();
		}
		putBeeperIfEmpty();
	}

	private void go_home(){
		face_south();
		while(frontIsClear()){
			move();
		}
	}

	private void move_right(){
		face_east();
		for (int i = 0; i < 4; i++) { 
			move();
		}

	}
}