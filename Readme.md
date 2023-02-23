# Introduction

This is a project created by Geza Czimeth for demonstration purposes.
The project has several parts:
- infrastructure
- microservices
- postman test file

### How to test
First start up infrastructure elements, see infrastructure directory

### What to expect

A microservices application with cloud config and RabbitMQ and MySQL(JPA) integration.

### Architecture
![Architecture](/assets/images/architecture.png)

### System messaging sequence
![Architecture](/assets/images/general_use_case_sequence_diagram.png)

### Possible improvements

- Dockerise everything into a docker-compose setup
- Implement api gateway service
- Auto refresh
- Distributed log collection
- Resillience(retry implementation with fallback)
