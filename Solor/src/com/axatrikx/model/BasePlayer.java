package com.axatrikx.model;

public class BasePlayer {

	public enum State {
		IDLE, MOVING, JUMPING, DYING
	}
	
	public enum Direction {
		LEFT, RIGHT, UP, DOWN;
	}
	
	public boolean isHero = false;
}
