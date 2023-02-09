# Introduction

This is a project created by Geza Czimeth for demonstration purposes.
The project has several parts:
- infrastructure
- microservices
- postman test file

### How to test

### What to expect

A fully <b>dockerised</b> application what consist of <b>microservices</b> which loads their own <b>configuration from the cloud</b> and connected with <b>messaging queues</b>.
Calling the microservices can be done directly or though the API gateway.

### Architecture
![Architecture](/assets/images/architecture.png)


### Planned feature list

- Rest interface to submit order(through API gateway)
- Mapping libraries usage
- Validation on request
- Customized Error handling
- SQL data storage with JPA
- ResTemplate usage to send messages to Broker
- Centralised cloud config
- Auto refresh(?S16)
- Distributed log collection?
- Resillience(retry implementation with fallback)
- Dockerised application/Docker compose also
- RabbitMQ topic with several subscribers
- Dockerised rabbmit/mysql setup
- Distributed tracing with zipkin(?)
 (https://github.com/micrometer-metrics/tracing/wiki/Spring-Cloud-Sleuth-3.1-Migration-Guide)