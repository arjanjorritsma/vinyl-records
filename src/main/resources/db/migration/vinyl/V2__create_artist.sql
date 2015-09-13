------------------------------------------------------------------
--  TABLE artist
------------------------------------------------------------------

CREATE TABLE vinyl.artist
(
   id        BIGINT NOT NULL,
   "name"    VARCHAR (50) NOT NULL,
   version   INTEGER NOT NULL
);


ALTER TABLE vinyl.artist
   ADD CONSTRAINT artist_pkey PRIMARY KEY (id);
   
CREATE SEQUENCE vinyl.hibernate_sequence INCREMENT BY 1
                                   NO MINVALUE
                                   NO MAXVALUE
                                   START WITH 1
                                   CACHE 1;   