## Schemaspy information for launch jobs

## Configuration
schemaspy.properties contains basic information to connect database and generate source
NOTE: for launch schemaspy is necessary mysql connector library and setting into, download it or insert path from .m2 repository

## Generate source

Launch following command from terminal, the command generate html information in "output" subfolder

java -jar schemaspy-6.0.0-rc2.jar -t mysql-nossl.properies -meta metadata/ -noimplied -I "(DATABASECHANGELOG|DATABASECHANGELOGLOCK|revision_info|.*hist)"

