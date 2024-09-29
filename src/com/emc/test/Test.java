package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.id = 123l;
		organizer.name = "Bini";
		System.out.println(organizer.name);

		Event event = new Event(456l," Neha Babu", "Software Engineer");
		System.out.println(event.description);
	}

}
