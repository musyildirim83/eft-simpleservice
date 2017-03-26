Dropwizard service using DDSL
======================================

Make sure zookeeper is running on localhost.

Build and package the example app:

    mvn package

start the all services:

    java -jar target/simpleservice.jar server config.yml
    java -jar target/simpleservice.jar server config2.yml
    java -jar target/simpleservice.jar server config3.yml

