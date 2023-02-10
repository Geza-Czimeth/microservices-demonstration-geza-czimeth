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

### Mysql Db setup

<pre>
docker run --name some-mysql5 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d -p 3306:3306 mysql
</pre>

After that connect with intellij Database view
<pre>
using username:root
passowrd: my-secret-pw
</pre>
and run the content of the
<pre>
mysql_database/*.script
</pre>
to create the necessary structure.
