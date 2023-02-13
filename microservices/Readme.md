# Introduction

This directory contains all the microservices in the system

### List of microservices

1. Order microservice
   - receives orders though Rest interface(test it with postman file)
2. Accounting microservice
   - reads order messages from RabbitMQ
3. Warehouse microservice
   - reads order messages from RabbitMQ

### Other modules

1. Base domain
   - contains the domain classes

### What is being demonstrated
- Spring Rest integration usage
- Spring JPA integration usage
- Automated Mapping libraries usage(https://modelmapper.org/)
- Request validation(https://beanvalidation.org/)
- Customized Validation Error handling([GlobalExceptionHandler](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/phase1/microservices/order-microservice/src/main/java/com/bigfish/order/exception/GlobalExceptionHandler.java))
- Customized Exception handling ([GlobalExceptionHandler](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/phase1/microservices/order-microservice/src/main/java/com/bigfish/order/exception/GlobalExceptionHandler.java))
- RabbitMQ integration
  - Sending and receiving Json message to RabbitMQ
- Spring cloud configuration usage
- JPA Spring integration
  - MySql database is used to store warehouse order records
    - [Repository configuration](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/f1cdcf0a41f4419ac0a9b98137acb22e3851b1db/microservices/warehouse-microservice/src/main/java/com/bigfish/warehouse/persistence/WarehouseRepository.java#L6)
    - [Consume from JMS and store](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/f1cdcf0a41f4419ac0a9b98137acb22e3851b1db/microservices/warehouse-microservice/src/main/java/com/bigfish/warehouse/consumer/RabbitMQConsumer.java#L19)
    