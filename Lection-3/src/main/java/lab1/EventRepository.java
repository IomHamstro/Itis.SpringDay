package lab1;

import lab1.model.Event;
import lab1.model.Guest;

import java.util.List;

/**
 * Created by Ольга on 08.04.2015.
 */
public interface EventRepository {

    Event createEvent(String name, List<Guest> guests);
    public void registr(Guest guest, Event event);
}
