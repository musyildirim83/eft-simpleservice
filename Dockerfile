FROM java:alpine
ADD target/simpleservice.jar /data/simpleservice.jar
ADD conf /data/conf
CMD java -jar /data/simpleservice.jar server /data/conf/local/config.yml
ENV SERVICE_TAGS=rest
ENV SERVICE_NAME=simpleservice
EXPOSE 8080
