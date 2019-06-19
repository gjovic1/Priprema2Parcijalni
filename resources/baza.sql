create table odgovori (
    id integer primary key,
    tekst text,
    pitanjeFK integer
);

create table pitanja (
    id integer primary key,
    tekst text,
    indexTacnog integer,
    kvizFK integer
);

create table kvizovi (
    id integer primary key,
    naziv text
);