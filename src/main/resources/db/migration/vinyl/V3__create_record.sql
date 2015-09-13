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