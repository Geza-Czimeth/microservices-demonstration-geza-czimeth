# Introduction

This is a project created by Geza Czimeth for demonstration purposes.
The project has several parts:
- infrastructure
- microservices
- postman test file

### How to test
First start up infrastructure elements

### What to expect

A fully <b>dockerised</b> application what consist of <b>microservices</b> which loads their own <b>configuration from the cloud</b> and connected with <b>messaging queues</b>.
Calling the microservices can be done directly or though the API gateway.

### Architecture
![Architecture](/assets/images/architecture.png)


### Planned feature list

- Rest interface to submit order(through API gateway)
- Mapping libraries usage
- Validation on request(uses custom error/exception handler)
- Customized Error handling

- RabbitMQ topic with several subscribers
- ResTemplate/RabbitTemplate usage to send messages to Broker

- SQL data storage with JPA

- Centralised cloud config -->Last phase
    - Auto refresh(?S16)
    - all configuration is extracted out to cloud config
      - currently configuration files stored of this repo root for simplification
  
- Distributed log collection?
- Resillience(retry implementation with fallback)
- Dockerised application/Docker compose also --> Last phase

- Dockerised rabbmit/mysql setup --> always is
- Distributed tracing with zipkin(?) --> always is
 (https://github.com/micrometer-metrics/tracing/wiki/Spring-Cloud-Sleuth-3.1-Migration-Guide)
