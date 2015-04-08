package lab1;

import lab1.model.Event;
import lab1.model.Guest;

import java.util.List;

/**
 * Created by Ольга on 08.04.2015.
 */
public interface EventService {

    Event createEvent(String name, List<Guest> guests);
    void registration(Guest guest, Event event);
    List<Guest> getListGuest(Event event);

}
