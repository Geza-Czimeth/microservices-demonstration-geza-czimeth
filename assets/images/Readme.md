## Introduction
Image assets what linked into the main 'Readme.md' file.

### Tools used
https://www.planttext.com/

<pre>
@startuml
Client -> OrderMicroservice:RestInterface: order
OrderMicroservice -> OrderMicroservice: validateOrder
OrderMicroservice -> RabbitMQ: Order
RabbitMQ -> AccountingMicroservice: consumeOrder
RabbitMQ -> WarehouseMicroservice: consumeOrder
WarehouseMicroservice -> Database: storeOrderr
@enduml
</pre>
