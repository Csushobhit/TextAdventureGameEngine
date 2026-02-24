package com.textadventure.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.textadventure.model.Item;

public class Player {
	private String currentRoomName;
	private List<Item> inventory;
	
	public Player(String startingRoomName)
	{
		if(startingRoomName == null || startingRoomName.trim().isEmpty())
		{
			throw new IllegalArgumentException("Player starting room name cannot be null or empty.");
		}
		this.currentRoomName = startingRoomName.trim();
		this.inventory = new ArrayList<>();
	}
	public void takeItem(Item item)
	{
		if(item == null)
		{
			throw new IllegalArgumentException("Cannot add a null item to player inventory.");
		}
		this.inventory.add(item);
	}
	
	public boolean dropItem(Item item)
	{
		if(item == null)
		{
			throw new IllegalArgumentException("Cannot drop a null item from player inventory.");
		}
		return this.inventory.remove(item);
	}
	public List<Item> getInventory()
	{
		return this.inventory;
	}
	public String getCurrentRoomName()
	{
		return this.currentRoomName;
	}
	public void setCurrentRoomName(String newRoomName)
	{
		if(newRoomName == null || newRoomName.trim().isEmpty())
		{
			throw new IllegalArgumentException("Cannot set current room name to null or empty.");
		}
		this.currentRoomName = newRoomName.trim();
	}
}
