# Introduction

This directory contains all the microservices in the system

### List of microservices

1. Order microservice
2. Accounting microservice
3. Warehouse microservice

### Other modules

1. Base domain

### What is being demonstrated at Order microservice
- Spring Rest integration usage
- Automated Mapping libraries usage(https://modelmapper.org/)
- Request validation(https://beanvalidation.org/)
- Customized Validation Error handling([GlobalExceptionHandler](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/phase1/microservices/order-microservice/src/main/java/com/bigfish/order/exception/GlobalExceptionHandler.java))
- Customized Exception handling ([GlobalExceptionHandler](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/phase1/microservices/order-microservice/src/main/java/com/bigfish/order/exception/GlobalExceptionHandler.java))
- RabbitMQ integration
  - Sending Json message to RabbitMQ

### What is being demonstrated at Accounting microservice
- RabbitMQ integration
  - Receiving Json message from RabbitMQ and automatically converting to Object

### What is being demonstrated at Warehouse microservice
- RabbitMQ integration
  - Receiving Json message from RabbitMQ and automatically converting to Object
- JPA Spring integration
  - MySql database is used to store warehouse order records
    - [Link](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/f1cdcf0a41f4419ac0a9b98137acb22e3851b1db/microservices/warehouse-microservice/src/main/java/com/bigfish/warehouse/persistence/WarehouseRepository.java#L6)
    - [Consume from JMS and store](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/f1cdcf0a41f4419ac0a9b98137acb22e3851b1db/microservices/warehouse-microservice/src/main/java/com/bigfish/warehouse/consumer/RabbitMQConsumer.java#L19)