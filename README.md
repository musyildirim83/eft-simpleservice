Dropwizard service using DDSL
======================================

Make sure zookeeper is running on localhost.

Build and package the example app:

    mvn package

start the all services:

    java -jar target/simpleservice.jar server conf/local/config.yml
    java -jar target/simpleservice.jar server conf/local/config2.yml
    java -jar target/simpleservice.jar server conf/local/config3.yml

