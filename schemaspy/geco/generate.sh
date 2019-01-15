#!/usr/bin/env bash

archiveName="Geco DB Schema.zip"
rm -rf output
rm -rf "$archiveName"

java -jar schemaspy-6.0.0-rc2.jar -t mysql-nossl.properies -meta metadata/ -noimplied -I "(DATABASECHANGELOG|DATABASECHANGELOGLOCK|revision_info|.*hist|geco_auth.executive_department|geco_auth.executive_user_detail|geco_auth.marketing_user_detail)" -dp ${HOME}/.m2/repository/mysql/mysql-connector-java/5.1.46/mysql-connector-java-5.1.46.jar

zip -r "$archiveName" output/
