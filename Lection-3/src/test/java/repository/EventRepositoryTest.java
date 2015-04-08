package repository;

import lab1.*;
import lab1.model.Event;
import lab1.model.Guest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class EventRepositoryTest {

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Autowired
    GuestRepository guestRepository;


    @Test
    public void testFindAll() throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("lab1");
        EventService service = context.getBean(EventService.class);
        Guest guest = new Guest("Vasya");
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest);
        Assert.assertNotNull(service.getListGuest(service.createEvent("JD", guests)));
    }
}
