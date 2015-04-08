package lab1.model;

/**
 * Created by Ольга on 08.04.2015.
 */
public class Order {

    private Event event;
    private Guest guest;

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
