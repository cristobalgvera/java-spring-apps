-- 'data.sql' is a reserved name to tell Spring Boot that this will be an
-- initial data set up for our database.
-- 'schema.sql' is the same but to create the database
INSERT INTO users (username, password, enabled)
VALUES ('crisgvera', '12345', true);

INSERT INTO users (username, password, enabled)
VALUES ('foo', 'bar', true);

INSERT INTO authorities (username, authority)
VALUES ('crisgvera', 'ROLE_ADMIN');

INSERT INTO authorities (username, authority)
VALUES ('foo', 'ROLE_USER');