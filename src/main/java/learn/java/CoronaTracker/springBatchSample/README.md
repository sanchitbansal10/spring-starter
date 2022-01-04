Project: https://spring.io/guides/gs/batch-processing/


Common Batch Processing Paradigm:
ingest data -> transform it (Or run some side affect on Data) -> pipe to somewhere else


How to run:
See README of SimpleMySqlAPI project to check how to run and configure database
Create an sql table in db_example database called people..Can check the steps in /resources/schema-all.sql file

What is it doing:
1. Reading the CSV file in /resources
2. Transforming the CSV names to caps
3. Putting them in mysql people table on db_example database 

