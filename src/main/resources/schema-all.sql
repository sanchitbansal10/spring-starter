DROP TABLE IF EXISTS people;

CREATE TABLE people  (
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);

--Spring Boot runs schema-@@platform@@.sql automatically during startup. -all is the default for all platforms.

-- Currently this is not running for some reason, need to do this manually