package com.emc.entities;

public class Event {
	public Long id;
	public String name;
	public String description;
	public String startTime;
	public String endTime;
	public boolean started;

	public Event(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
