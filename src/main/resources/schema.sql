create table states (
    id              integer PRIMARY KEY,
    name            varchar(20) NOT NULL,
    abbreviation    varchar(2) NOT NULL
);

create table cities (
    id          integer PRIMARY KEY,
    name        varchar(100) NOT NULL,
    states_id   integer REFERENCES states (id)
);

create table zip_codes (
    number      varchar(10) PRIMARY KEY,
    address     varchar(256) NOT NULL,
    district    varchar(100),
    cities_id   integer REFERENCES cities (id),
    states_id   integer REFERENCES states (id)
);