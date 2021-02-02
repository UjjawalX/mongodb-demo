# mongodb-demo
Mongodb Transaction.

Introduction : 
This project explains a poc of distribution transaction in MongoDB. 

Description: 
The project explains the situation when the transaction needs to be managed across collection in MongoDB. MongoDB provides transaction management across replica as well as shards. 
For now the project only talks about collection spread across replica. 
In the given project developed over spring-framework has two collections created : Customer and Channels . Two apis are provided to add channel and customer. There is a delete operation is provided which is annotated with @Transactionl annotation to define the transaction boundary which means either all operations are completed or none are.

Initialize the project: 
The project needs to build and run using mvn .
mvn spring-boot:run

The apis that can be accessed : 
localhost:8080/customer/ (POST)

localhost:8080/channel/ (POST)

localhost:8080/customer?customerId=6017df12b19aa900bd21dcf8 (DELETE)
