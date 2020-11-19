/**
 * Author:  14MEvans
 * Created: 02-Nov-2020
 */

--Creating User Table
CREATE TABLE tblUser (
    UserID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1000, INCREMENT BY 1),
    Username VARCHAR (20),
    Password VARCHAR (20),
    TestHistory VARCHAR (3000),
    RememberedAccount VARCHAR (20),
    PRIMARY KEY (UserID)
);

--Creating table for Suvat
CREATE TABLE tblSUVAT (
    qID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1000, INCREMENT BY 1),
    Difficulty VARCHAR (6),
    Marks NUMERIC (2),
    Wording VARCHAR (4000),
    GenAnswer VARCHAR (500),
    MarkScheme VARCHAR (4000),
    ExamBoard VARCHAR (50),
    PRIMARY KEY (qID)
);

--Creating table for Projectile motion questions
CREATE TABLE tblProjectileMotion (
    qID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1000, INCREMENT BY 1),
    Difficulty VARCHAR (6),
    Marks NUMERIC (2),
    Wording VARCHAR (4000),
    GenAnswer VARCHAR (500),
    MarkScheme VARCHAR (4000),
    ExamBoard VARCHAR (50),
    PRIMARY KEY (qID)
);

--Creating table for forces questions
CREATE TABLE tblForces (
    qID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1000, INCREMENT BY 1),
    Difficulty VARCHAR (6),
    Marks NUMERIC (2),
    Wording VARCHAR (4000),
    GenAnswer VARCHAR (500),
    MarkScheme VARCHAR (4000),
    ExamBoard VARCHAR (50),
    PRIMARY KEY (qID)
);