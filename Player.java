/** Program: Player
 * File: Player.java
 * Summary: Player class for NFL Draft Program
 * Author: Richard Boyd
 * Date:January 14th, 2018
 */

public abstract class Player {
	
	private String name;  //defines properties
	private String position;
	private int age; 
	private int yrs;
	
	
	public Player() {	//no argument constructor
	}
	
	public Player(String name1, String position1, int age1, int yrs1) {
		name = name1;
		position = position1;   //constructor with all arguments
		age = age1;
		yrs = yrs1;
	}
	
	public String getName() {   //getters and setters
		return this.name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String newPosition) {
		this.position = newPosition;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public int getYrs() {
		return this.yrs;
	}
	public void setYrs(int newYrs) {
		this.yrs = newYrs;
	}
	
	public String toString() {   //toString method
		return name + ", " + position + ", " + age + ", " + yrs;
	}
}
