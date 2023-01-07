package com.team;

import java.util.List;

public class RCBTeam {
	private String name;
	private String location;
	private List<Players> player;
	
	public List<Players> getPlayer() {
		return player;
	}
	public void setPlayer(List<Players> player) {
		this.player = player;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
