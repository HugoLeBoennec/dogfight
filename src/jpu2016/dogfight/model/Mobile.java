package jpu2016.dogfight.model;

import java.awt.*;

public class Mobile implements IMobile {
	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		
	}
	public Direction getDirection() {
		return null;
		
	}
	public void setDirection(Direction direction) {
		
	}
	public Point getPosition() {
		return null;
		
	}
	public Dimension getDimension() {
		return null;
		
	}
	public int getSpeed() {
		return 1;
		
	}
	public int getWidth() {
		return 1;
		
	}
	public int getHeight() {
		return 1;
		
	}
	public void move() {
		
	}
	public void placeInArea(IArea area) {
		
	}
	public boolean isPlayer(int player) {
		return true;
		
	}
	private void moveUp() {
		
	}
	private void moveRight() {
		
	}
	private void moveDown() {
		
	}
	private void moveLeft() {
		
	}
	public Color getColor() {
		return null;
		
	}
	public IDogfightModel getDogfightModel() {
		return null;
		
	}
	public void setDogfightModel(DogfightModel dogfightModel) {
		
	}
	public boolean hit() {
		return true;
		
	}
	public boolean isWeapon() {
		return true;
		
	}
	public Image getImage() {
		return null;
		
	}
}
