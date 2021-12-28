Create an empty project using spring initializer


pom.xml define all the dependencies

Build an executable JAR
    mvn clean package




Annotations used:
@RestController
@Controller
@GetMapping
@RequestParamas]




How to run mysql server locally

start the mysql service: brew services start mysql
use mysql client to connect to this db: sudo mysql --password
Enter the password: ember212@Pay123

Then Create a new database:
mysql> create database db_example; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
