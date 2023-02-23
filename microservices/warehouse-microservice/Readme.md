# warehouse-microservice

This project is the warehouse-microservice. It reads order messages from RabbitMq and stores them into the database.
To test it you should submit order to the <pre>order-microservice</pre>.
Use the <pre>assets/postman/microservices-demonstration-geza-czimeth.postman_collection.json</pre> to test it.

### Build

mvn clean install

### Run

1. Start up mysql, see [Readme.md](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/phase_7/infrastructure/Readme.md)
2. Start up RabbitMQ, see [Readme.md](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/phase_7/infrastructure/Readme.md)
3. java -jar target/warehouse-microservice-1.0-SNAPSHOT.jar

Note:
Tested locally with "java 18.0.2 2022-07-19"
