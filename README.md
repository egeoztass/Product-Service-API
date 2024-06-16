# Simple Microservice Spring Backend
Product Service API

Description

This is a simple RESTful API developed with Spring Boot for managing products. The API allows clients to create, view, update and delete products.

The API supports the following operations:

A client can create new products.

A client can modify its own products but cannot modify others’ products.

A client can delete its own products but cannot delete others’ products.

A client can view all products.

Setup

Requirements:

-Java 11
-Maven

Steps to run the application

-Clone this repository.

-Navigate into the directory of the project.

-Build the project with the following Maven command:

-Copy code

-mvn clean install

Run the application with the following command:

java -jar target/demo-0.0.1-SNAPSHOT.jar

API Endpoints:
Method	Endpoint	Description

POST	/api/v1/user	Create a new user

GET	/api/v1/user	Retrieve all users

POST	/api/v1/product	Create a new product

GET	/api/v1/product	Retrieve all products

PUT	/api/v1/product/{id}/{ownerId}	Update a product by ID and OwnerId

DELETE	/api/v1/product/{id}/{ownerId}	Delete a product by ID and OwnerId

Please replace {id} and {ownerId} with actual values.

Future Improvements

Future versions of this API could include the following features:

A real database instead of in-memory storage.
Error handling.
Authentication and authorization.
Automated testing.
Deployability, for example with a Dockerfile.

Feedback

If you have any questions or feedback, please feel free to contact me.
