#!/usr/bin/env bash

archiveName="Azimut DB Schema.zip"
rm -rf output
rm -rf "$archiveName"

java -jar schemaspy-6.0.0-rc2.jar -t mysql-nossl.properies -meta metadata/ -noimplied -I "(DATABASECHANGELOG|DATABASECHANGELOGLOCK|revision_info|.*hist)" -dp ${HOME}/.m2/repository/mysql/mysql-connector-java/5.1.46/mysql-connector-java-5.1.46.jar

zip -r "$archiveName" output/
