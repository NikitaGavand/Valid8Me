Part 2 Java Exercise

This is a spring boot project which implements a new microservice for interacting with customer records. 

Technology Used:
Spring Boot
MySQL
Hibernate

API:
localhost:8080/customer/save
localhost:8080/customer/update
localhost:8080/customer/delete/123
localhost:8080/customer/getAllCustomer
localhost:8080/customer/123


Performed CRUD operation on customer Records
Please add the local database properties into the application.properties file
I have used SQL database 
I have used JPA to perform all the crud operation since it doesnt run any complex query.

Additional Areas:
 If you need to handle the authorisation based on the endpoint, how would you manage it? 
And what if authorisation is based on the data or a subset of the data itself?
To handle authorisation we can add Basic auth and authenticate the user by adding custom annotation like @preauthorize and perform authentication functionality on top of the controller

• How would you ensure data integrity?
1. Adding Validations, 
2.Testing the endpoints, 
3.check format of the data, 
4.adding security
5. testing vulnerable cases like SQL injections


• Where would you focus your testing efforts, and why?
Testing efforts can be focused majorly on endpoints. 
Testing all the endpoints work as expected.
Junit test cases for each block of code
and database testing of connection


• There may be a need to dynamically scale this microservice. Based on your design implementation, what approach would you take and why?
Containerization using docker by creating image