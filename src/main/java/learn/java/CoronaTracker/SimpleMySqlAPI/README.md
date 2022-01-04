Project: https://spring.io/guides/gs/accessing-data-mysql/



How to run mysql server locally
start the mysql service: brew services start mysql
use mysql client to connect to this db: sudo mysql --password
Enter the password: ember212@Pay123

Then Create a new database if its not there:
mysql> create database db_example; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database

// all these users and db are then set in application.properties


COMMON MYSQL COMMANDS:
SHOW DATABASES;
use db_example;
SHOW TABLES
DROP <table name>



What is it doing:
1. POST and GET api to add user to the users table in db_example database;
