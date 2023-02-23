# Introduction

This directory contains all the microservices in the system

### List of microservices

1. Order microservice
   - receives orders though Rest interface
   - sends accepted order to RabbitMQ
2. Accounting microservice
   - reads order messages from RabbitMQ
3. Warehouse microservice
   - reads order messages from RabbitMQ and stores it to MySQL

### Other modules

1. Base domain
   - contains the domain classes

### What is being demonstrated
- Spring Rest integration usage in [OrderServiceController](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/cb00a0430c1eb4c88524fef69381965b752494ac/microservices/order-microservice/src/main/java/com/bigfish/order/controller/OrderServiceController.java#L25)
- RabbitMQ integration in [RabbitMQConfig](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/846350e88219d929e923b63bef4c543b5b2a00ec/microservices/order-microservice/src/main/java/com/bigfish/order/config/RabbitMQConfig.java#L13)
  - Sending messages to RabbitMQ [RabbitMQJsonProducer](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/846350e88219d929e923b63bef4c543b5b2a00ec/microservices/order-microservice/src/main/java/com/bigfish/order/producer/RabbitMQJsonProducer.java#L27)
  - Receiving messages [RabbitMQConsumer](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/cb00a0430c1eb4c88524fef69381965b752494ac/microservices/warehouse-microservice/src/main/java/com/bigfish/warehouse/consumer/RabbitMQConsumer.java#L17)
- Spring JPA integration usage in [RabbitMQConsumer](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/cb00a0430c1eb4c88524fef69381965b752494ac/microservices/warehouse-microservice/src/main/java/com/bigfish/warehouse/consumer/RabbitMQConsumer.java#L20)
- Automated Mapping libraries usage [OrderServiceController ](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/cb00a0430c1eb4c88524fef69381965b752494ac/microservices/order-microservice/src/main/java/com/bigfish/order/controller/OrderServiceController.java#L28)(https://modelmapper.org/)
- Request validation [OrderServiceController](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/cb00a0430c1eb4c88524fef69381965b752494ac/microservices/order-microservice/src/main/java/com/bigfish/order/controller/OrderServiceController.java#L26) (https://beanvalidation.org/)
- Customized Validation Error handling([GlobalExceptionHandler](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/4d5d9d261aecf032cfc8b24803e4438d34222055/microservices/order-microservice/src/main/java/com/bigfish/order/exception/GlobalExceptionHandler.java#L32))
- Customized Exception handling ([GlobalExceptionHandler](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/4d5d9d261aecf032cfc8b24803e4438d34222055/microservices/order-microservice/src/main/java/com/bigfish/order/exception/GlobalExceptionHandler.java#L25))

- Spring cloud configuration usage
- JPA Spring integration
  - MySql database is used to store warehouse order records
    - [Repository configuration](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/f1cdcf0a41f4419ac0a9b98137acb22e3851b1db/microservices/warehouse-microservice/src/main/java/com/bigfish/warehouse/persistence/WarehouseRepository.java#L6)
    - [Consume from JMS and store](https://github.com/Geza-Czimeth/microservices-demonstration-geza-czimeth/blob/f1cdcf0a41f4419ac0a9b98137acb22e3851b1db/microservices/warehouse-microservice/src/main/java/com/bigfish/warehouse/consumer/RabbitMQConsumer.java#L19)
    