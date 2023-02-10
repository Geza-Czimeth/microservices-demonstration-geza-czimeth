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
- Customized Validation Error handling(ExceptionHandler.class)
- Customized Exception handling(ExceptionHandler.class)
- RabbitMQ integration
  - Sending Json message to RabbitMQ

### What is being demonstrated at Accounting microservice
- RabbitMQ integration
  - Receiving Json message from RabbitMQ and automatically converting to Object
