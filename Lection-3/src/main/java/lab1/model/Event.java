package lab1.model;

import java.util.List;

/**
 * Created by Ольга on 08.04.2015.
 */
public class Event {

    private String name;
    private Integer count_g;
    List<Guest> guests;

    public Event(String name, List<Guest> guests) {
        this.name = name;
        this.count_g = 0;
        this.guests = guests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count_g;
    }

    public void setCount(Integer count) {
        this.count_g = count;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
