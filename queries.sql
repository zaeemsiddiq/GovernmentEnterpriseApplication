Create table "User"(
UserID          INTEGER NOT NULL 
                PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
                (START WITH 1, INCREMENT BY 1),
LAST_NAME VARCHAR(20),
FIRST_NAME VARCHAR(20),
Email VARCHAR(50),
Password VARCHAR(50),
Type INTEGER, 
Address VARCHAR(100),
Phone VARCHAR(20)
);

Create table "Service"(
Service_ID         INTEGER NOT NULL 
                PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
                (START WITH 1, INCREMENT BY 1),
Service_Name VARCHAR(20),
Type INTEGER, 
Thumbnail VARCHAR(100),
Description VARCHAR(250)
);