#!/usr/bin/env bash
mvn clean package
java -jar -Dspring.profiles.active=azure app/target/peer-client-app-0.0.1-SNAPSHOT.jar