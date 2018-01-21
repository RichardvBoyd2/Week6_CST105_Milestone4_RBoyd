/** Program: Player Manager
 * File: PlayerManager.java
 * Summary: Creates a list of players and manages the info
 * Author: Richard Boyd
 * Date: January 14th 2018
 */

import java.util.ArrayList;
public class PlayerManager {
	
	ArrayList<Player> list = new ArrayList<Player>();  //Creates ArrayList
	
	public PlayerManager() {  //Constructor of the PlayerManager
		createPlayers(); //calls the createPlayers method
	}
	
	private ArrayList<Player> createPlayers() {  //Player names and stats hard coded into the createPlayers method
		OffensivePlayer manning = new OffensivePlayer();
		manning.setName("Peyton Manning");
		manning.setPosition("Quarterback");
		manning.setAge(34);
		manning.setYrs(12);
		manning.setPassAtt(679);
		manning.setPassCmp(450);
		manning.setRushAtt(18);
		manning.setRushYrds(18);
		manning.setRec(0);
		manning.setRecYrds(0);
		list.add(manning);
		
		OffensivePlayer brown = new OffensivePlayer(); 
		brown.setName("Donald Brown");
		brown.setPosition("Running Back");
		brown.setAge(23);
		brown.setYrs(1);
		brown.setPassAtt(0);
		brown.setPassCmp(0);
		brown.setRushAtt(129);
		brown.setRushYrds(497);
		brown.setRec(20);
		brown.setRecYrds(205);
		list.add(brown);
		
		OffensivePlayer garcon = new OffensivePlayer(); 
		garcon.setName("Pierre Garcon");
		garcon.setPosition("Wide Receiver");
		garcon.setAge(24);
		garcon.setYrs(2);
		garcon.setPassAtt(0);
		garcon.setPassCmp(0);
		garcon.setRushAtt(2);
		garcon.setRushYrds(6);
		garcon.setRec(67);
		garcon.setRecYrds(784);
		list.add(garcon);
		
		DefensivePlayer bethea = new DefensivePlayer();
		bethea.setName("Antoine Bethea");
		bethea.setPosition("Free Safety");
		bethea.setAge(26);
		bethea.setYrs(4);
		bethea.setInter(1);
		bethea.setIntYrds(31);
		bethea.setSacks(1);
		bethea.setTackles(77);
		list.add(bethea);
		
		OffensivePlayer cutler = new OffensivePlayer(); 
		cutler.setName("Jay Cutler");
		cutler.setPosition("Quarterback");
		cutler.setAge(27);
		cutler.setYrs(4);
		cutler.setPassAtt(432);
		cutler.setPassCmp(261);
		cutler.setRushAtt(50);
		cutler.setRushYrds(232);
		cutler.setRec(0);
		cutler.setRecYrds(0);
		list.add(cutler);
		
		OffensivePlayer forte = new OffensivePlayer(); 
		forte.setName("Matt Forte");
		forte.setPosition("Running Back");
		forte.setAge(25);
		forte.setYrs(2);
		forte.setPassAtt(0);
		forte.setPassCmp(0);
		forte.setRushAtt(237);
		forte.setRushYrds(1069);
		forte.setRec(51);
		forte.setRecYrds(547);
		list.add(forte);
		
		OffensivePlayer knox = new OffensivePlayer();
		knox.setName("Johnny Knox");
		knox.setPosition("Wide Receiver");
		knox.setAge(24);
		knox.setYrs(1);
		knox.setPassAtt(0);
		knox.setPassCmp(0);
		knox.setRushAtt(1);
		knox.setRushYrds(2);
		knox.setRec(51);
		knox.setRecYrds(960);
		list.add(knox);
		
		return list;
	}

	public String toString() { //the toString method for PlayerManager
		String roster = list.toString();
		return roster;
	}

}
