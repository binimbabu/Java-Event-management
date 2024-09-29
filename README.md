lets consider an Event Management example.

In the Event Management we have organizer, event, participant and venue. Organizer will organize the event and then assign a venue and inform participants to join the event. Organizer has 'id' and 'name'. Event has 'id', 'name', description, startTime, endTime, started. Venue  has 'id', 'name', description, strretAddress, city, state, country, pincode. Participant has 'id', 'name' and 'email'.

package com.emc.entities;

public class Organizer {
	public Long id;
	public String name;	
}



package com.emc.entities;

public class Event {
	public Long id;
	public String name;
	public String description;
	public String startTime;
	public String endTime;
	public boolean started;

	public Event(Long id, String name, String description) { // parametrized constructor
		this.id = id;
		this.name = name;
		this.description = description;
	}
}



package com.emc.entities;

public class Venue {
	public Long id;
	public String name;
	public String description;
	public String streetAddress;
	public String city;
	public String state;
	public String pinCode;
}




package com.emc.entities;

public class Participant {
	public Long id;
	public String name;
	public String email;
	public boolean checkedId;
}



package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.id = 123l;
		organizer.name = "Bini";
		System.out.println(organizer.name);

		Event event = new Event(456l," Neha Babu", "Software Engineer"); //calling the parametrized constructor
		System.out.println(event.description);
	}

}

