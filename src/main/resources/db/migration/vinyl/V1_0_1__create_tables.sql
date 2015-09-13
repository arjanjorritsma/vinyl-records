
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
								   
CREATE TABLE vinyl.record
(
   id          BIGINT NOT NULL,
   "name"      VARCHAR (100) NOT NULL,
   version     INTEGER NOT NULL,
   year        INTEGER,
   artist_id   BIGINT NOT NULL
);

ALTER TABLE vinyl.record
   ADD CONSTRAINT RECORD_FK FOREIGN KEY (artist_id)
       REFERENCES vinyl.artist (id);
	   
ALTER TABLE vinyl.record
   ADD CONSTRAINT record_pkey PRIMARY KEY (id);	  								   