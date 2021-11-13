--
-- File generated with SQLiteStudio v3.3.3 on Wed Nov 10 21:19:32 2021
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: inputdata
DROP TABLE IF EXISTS inputdata;

CREATE TABLE inputdata (
    sno       INTEGER  PRIMARY KEY AUTOINCREMENT,
    name      VARCHAR,
    address   VARCHAR,
    gender    VARCHAR,
    knowledge VARCHAR,
    subject   VARCHAR,
    image     BLOB,
    date      DATETIME
);

INSERT INTO inputdata (
                          sno,
                          name,
                          address,
                          gender,
                          knowledge,
                          subject,
                          image,
                          date
                      )
                      VALUES (
                          2,
                          'Nikolaj',
                          'VSB',
                          'Male',
                          'C++ ',
                          'Computer science',
                          '...',
                          'NULL'
                      );

INSERT INTO inputdata (
                          sno,
                          name,
                          address,
                          gender,
                          knowledge,
                          subject,
                          image,
                          date
                      )
                      VALUES (
                          3,
                          'Ivan',
                          'VSB',
                          'Male',
                          'Java C++ Python ',
                          'Software engineering',
                          '...',
                          'NULL'
                      );

INSERT INTO inputdata (
                          sno,
                          name,
                          address,
                          gender,
                          knowledge,
                          subject,
                          image,
                          date
                      )
                      VALUES (
                          5,
                          'Jasna',
                          'VSB',
                          'Female',
                          '',
                          'Select subject',
                          '...',
                          '1975-05-19'
                      );


-- Table: users
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    sno      INTEGER PRIMARY KEY AUTOINCREMENT,
    username VARCHAR,
    password VARCHAR
);

INSERT INTO users (
                      sno,
                      username,
                      password
                  )
                  VALUES (
                      1,
                      'admin',
                      'admin'
                  );


COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
