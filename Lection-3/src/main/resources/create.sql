
CREATE TABLE PUBLIC.guests(
  name VARCHAR(255) NOT NULL PRIMARY KEY
);

CREATE TABLE PUBLIC.events(
  name VARCHAR(255) NOT NULL PRIMARY KEY,
  count_g int,
  guest VARCHAR(255)
);

CREATE TABLE PUBLIC.orders(
    event_name VARCHAR(255) ,
    guest_name VARCHAR(255),
  PRIMARY KEY (event_name,guest_name)
);
ALTER TABLE PUBLIC.events ADD FOREIGN KEY (guest) REFERENCES guests(name);