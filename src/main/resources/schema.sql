IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='Card')
CREATE TABLE Card (
    id int IDENTITY(1,1) PRIMARY KEY,
    name varchar(255) NOT NULL,
    imageUrl varchar(255) NOT NULL,
    code varchar(255) NOT NULL
);