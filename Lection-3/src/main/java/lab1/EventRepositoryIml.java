package lab1;

import lab1.model.Event;
import lab1.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Ольга on 08.04.2015.
 */
@Repository
public class EventRepositoryIml implements EventRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Event createEvent(String name, List<Guest> guests) {
        jdbcTemplate.update("insert into events (name,count,guests) values (?, ?,?)",
                name, guests.size(), guests);
        return new Event(name, guests);
    }

    public void registr(Guest guest, Event event) {
        jdbcTemplate.update(
                "insert into order (event, guest) values (?, ?)",
                event, guest);
    }
}
