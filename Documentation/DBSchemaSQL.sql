CREATE TABLE DRUGS
  (
    DRUG_ID     NUMBER (10) NOT NULL ,
    DRUG_NAME   VARCHAR2 (60) ,
    DESCRIPTION VARCHAR2 (255)
  ) ;
CREATE UNIQUE INDEX DRUGS__IDX ON DRUGS
  (
    DRUG_ID ASC
  )
  ;
ALTER TABLE DRUGS ADD CONSTRAINT DRUGS_PK PRIMARY KEY ( DRUG_ID ) ;


CREATE TABLE DRUG_PLAN
  (
    DRUG_PLAN_ID NUMBER (10) NOT NULL ,
    DRUG_ID      NUMBER (10) NOT NULL ,
    USER_ID      VARCHAR2 (10) NOT NULL ,
    START_DATE   DATE ,
    END_DATE     DATE ,
    FREQ_TYPE    VARCHAR2 (20) CHECK( FREQ_TYPE IN ('DAILY','BIWEEKLY','WEEKLY', 'MONTHLY') ),
    FREQ         NUMBER (3)
  ) ;
CREATE UNIQUE INDEX DRUG_PLAN__IDX ON DRUG_PLAN
  (
    DRUG_PLAN_ID ASC
  )
  ;
  CREATE INDEX DRUG_PLAN__IDXv1 ON DRUG_PLAN
    ( DRUG_ID ASC , USER_ID ASC
    ) ;
ALTER TABLE DRUG_PLAN ADD CONSTRAINT DRUG_PLAN_PK PRIMARY KEY ( DRUG_PLAN_ID ) ;


CREATE TABLE DRUG_PLAN_TIMES
  (
    DRUG_PLAN_ID NUMBER (10) NOT NULL ,
    TIME         DATE
  ) ;
CREATE INDEX DRUG_PLAN_TIMES__IDX ON DRUG_PLAN_TIMES
  ( DRUG_PLAN_ID ASC
  ) ;


CREATE TABLE DRUG_TRACK
  (
    DRUG_PLAN_ID NUMBER (10) NOT NULL ,
    TAKEN        TIMESTAMP
  ) ;
CREATE INDEX DRUG_TRACK__IDX ON DRUG_TRACK
  ( DRUG_PLAN_ID ASC
  ) ;


CREATE TABLE USERS
  (
    USER_ID   VARCHAR2 (10) NOT NULL ,
    USER_NAME VARCHAR2 (60) ,
    PASSWORD  VARCHAR2 (30) ,
    EMAIL     VARCHAR2 (60)
  ) ;
CREATE UNIQUE INDEX USERS__IDX ON USERS
  (
    USER_ID ASC
  )
  ;
ALTER TABLE USERS ADD CONSTRAINT USERS_PK PRIMARY KEY ( USER_ID ) ;


ALTER TABLE DRUG_PLAN ADD CONSTRAINT DRUG_PLAN_DRUGS_FK FOREIGN KEY ( DRUG_ID ) REFERENCES DRUGS ( DRUG_ID ) ;

ALTER TABLE DRUG_PLAN_TIMES ADD CONSTRAINT DRUG_PLAN_TIMES_DRUG_PLAN_FK FOREIGN KEY ( DRUG_PLAN_ID ) REFERENCES DRUG_PLAN ( DRUG_PLAN_ID ) ;

ALTER TABLE DRUG_PLAN ADD CONSTRAINT DRUG_PLAN_USERS_FK FOREIGN KEY ( USER_ID ) REFERENCES USERS ( USER_ID ) ;

ALTER TABLE DRUG_TRACK ADD CONSTRAINT DRUG_TRACK_DRUG_PLAN_FK FOREIGN KEY ( DRUG_PLAN_ID ) REFERENCES DRUG_PLAN ( DRUG_PLAN_ID ) ;
