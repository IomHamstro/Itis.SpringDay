package lab1;

import lab1.model.Event;
import lab1.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ольга on 08.04.2015.
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private GuestRepository guestRepository;

    @Override
    public Event createEvent(String name, List<Guest> guests) {
        return new Event(name, guests);
    }

    @Override
    public void registration(Guest guest, Event event) {
        eventRepository.registr(guest,event);
    }

    @Override
    public List<Guest> getListGuest(Event event) {
        return guestRepository.getGuests(event);
    }
}
