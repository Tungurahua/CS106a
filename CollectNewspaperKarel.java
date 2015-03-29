/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	public void run(){
		move_out();
		pick_up();
		move_back();
		putBeeper();
		putBeeper();
		putBeeper();
	}
	
	private void move_out(){
		move();
		move();
		turnRight();
		  move();
		turnLeft();
		move();	
	}
	private void pick_up(){
		pickBeeper();
		turnRight();
		turnRight();
	}
	
	private void move_back(){
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
	}
}
