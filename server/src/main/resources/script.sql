
/******************* TABLE COMPANY *******************/
CREATE TABLE IF NOT EXISTS companies (
    id varchar(255) primary key,
    name varchar(255),
    address varchar(255)
);

/******************* TABLE BUILDINGS *******************/
CREATE TABLE IF NOT EXISTS buildings (
    id varchar(255) primary key,
    name varchar(255),
    address varchar(255),
    companyId varchar(255) REFERENCES companies (id)
);

/******************* TABLE WINDOWS *******************/
CREATE TABLE IF NOT EXISTS windows (
    id varchar(255) primary key,
    floorStage int,
    isOpen boolean,
    buildingId varchar(255) REFERENCES buildings (id)
);

/******************* DATA FOR COMPANIES *******************/
INSERT INTO companies (id, name, address) VALUES ('1', 'Yassine company', 'paris');
INSERT INTO companies (id, name, address) VALUES ('2', 'Smart company', 'Lille');

/******************* DATA FOR BUILDINGS *******************/
INSERT INTO buildings (id, name, address, companyId) VALUES ('1', 'Yassine company', '51', '1');
INSERT INTO buildings (id, name, address, companyId) VALUES ('2', 'Smart company', '52', '2');

/******************* DATA FOR WINDOWS *******************/
INSERT INTO windows (id, floorStage, isOpen, buildingId) VALUES ('1', 5, true, '1');
INSERT INTO windows (id, floorStage, isOpen, buildingId) VALUES ('2', 20, false, '2');



