#!/usr/bin/env bash

archiveName="imillion DB Schema.zip"
rm -rf output
rm -rf "$archiveName"

java -jar schemaspy-6.0.0.jar -t mysql -meta metadata/ -noimplied -I "(DATABASECHANGELOG|DATABASECHANGELOGLOCK|revision_info)" -dp ${HOME}/.m2/repository/mysql/mysql-connector-java/8.0.16/mysql-connector-java-8.0.16.jar

zip -r "$archiveName" output/
