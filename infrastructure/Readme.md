# Introduction

This directory contains all the infrastructure elements of the application

### List of infrastructure elements

1. api-gateway
2. cloud-config-server
3. configuration-repository
4. RabbitMQ


### RabbitMq setup
<pre>
The following docker command used to start rabbitmq.

docker pull rabbitmq:3.9.27-management
docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.9.27-management

Management interface: http://localhost:15672/

username: guest
password: guest
</pre>
