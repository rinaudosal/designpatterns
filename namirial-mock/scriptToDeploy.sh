#!/bin/bash

# keep version of actual version
version=$(mvn help:evaluate -Dexpression=project.version | grep -e '^[^\[]')

# read actual version and give new version
echo Remember to update namirial-mock-deployment.yml with new version
echo Insert new maven version, actual version $version?
read newVersion
# update pom with new version
mvn versions:set -DnewVersion=$newVersion

# create new jar
mvn clean package

# build and tag docker image
docker build -t eu.gcr.io/az4u-dev/namirial-mock:$newVersion .
echo image tagged eu.gcr.io/az4u-dev/namirial-mock:$newVersion

# login to google cloud
gcloud container clusters get-credentials cluster-1 --zone europe-west1-b --project az4u-dev

# push to google cloud
gcloud docker -- push eu.gcr.io/az4u-dev/namirial-mock:$newVersion
echo image pushed eu.gcr.io/az4u-dev/namirial-mock:$newVersion

# apply deployment
kubectl apply -f kubernetes/namirial-mock-deployment.yml

echo Deploy in AZ4U DEV Backend e cluster-1 successful