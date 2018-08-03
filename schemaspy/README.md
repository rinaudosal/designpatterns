#Schemaspy information for launch jobs
#Download folder with all files

--> Launch job for terminal, this command generate html information in "output" subfolder

java -jar schemaspy-6.0.0-rc2.jar -t mysql-nossl.properies -meta metadata/ -I "(DATABASECHANGELOG|DATABASECHANGELOGLOCK|revision_info|.*hist)"

