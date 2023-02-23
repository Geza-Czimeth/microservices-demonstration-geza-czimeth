# order-microservice

This project is the order-microservice. It receives orders though rest interface and sends the accepted order to the RabbitMQ for other microservices.
Use the <pre>assets/postman/microservices-demonstration-geza-czimeth.postman_collection.json</pre> to test it.

### Build

mvn clean install

### Run

java -jar target/order-microservice-1.0-SNAPSHOT.jar

Note:
Tested locally with "java 18.0.2 2022-07-19"
