package lab1;

import lab1.model.Event;
import lab1.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Ольга on 08.04.2015.
 */
@Repository
public class GuestRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }



    public List<Guest> getGuests(Event event) {
        String sql = "SELECT guest FROM orders where event = ?";
        return jdbcTemplate.query(sql, new Object[] { event }, new BeanPropertyRowMapper(Guest.class));
    }
}
