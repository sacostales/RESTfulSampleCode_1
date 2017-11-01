# RESTfulSampleCode_1
Description:
Implementation of a RESTful web service that performs CRUD operations (Create, Read, Update, and Delete) for an entity (simple object); in this example it is a vehicle. The service supports requests via GET, POST, PUT and DELETE methods  

Pre-conditions:
1)	Environment Used: Java 7 and web server: Apache Tomcat 8 and Eclipse IDE (Mars). 
2)	API used: Java JAX-RS Jersey API for creation of RESTful web services. 

Instructions to Run:
1) This is a Maven Project; Therefore after checking out, user can run via a. command line: mvn clean package or mvn clean install 
b. import project into Eclipse, IntelliJ, etc. and build/run 
2)	After that, you need to add your project on Apache Tomcat 8 web server and start it. (If you don’t have it then install it first)
3)	Use any REST client tool to call the service (POSTMAN, HTTP Requester, etc.) 

http://localhost:8080/vehicle/webservice/vehicle

4)	To create, the first resource, you have to apply POST request with this URI:
http://localhost:8080/vehicle/webservice/vehicles
and in request body, you can write following type of JSON representation and set ‘content-type’ header as ‘application/json’. For example,

{
    
    "make": "Honda",
    "model": "EX,
    "year": 2009
  }

5)	After creating the resource, you can get it via GET request using:
http://localhost:8080/vehicle/webservice/vehicles
 
OR

http://localhost:8080/vehicle/webservice/vehicles/1
where 1 represents the vehicle id
 
6)	To update the resource, you can do it via PUT request. 
Ex: If you want to update the vehicle resource at Id: 1 then, you have to apply PUT request with the following URI:
http://localhost:8080/vehicle/webservice/vehicles/1 

 
-	You can check modification by requesting GET on:
http://localhost:8080/vehicle/webservice/vehicles/1


7)	To delete the resource, you have to apply DELETE request.
Ex: If you want to delete the resource with the vehicle id 1 then, you need to apply DELETE request with following URI:
http://localhost:8080/vehicle/webservice/vehicles/1 
 

-	It will delete the particular resource from database (In memory database). Status Code: 204 No Content

Addional Information: 
Maven Project in Eclipse IDE using standard Maven archetype for RESTful web services:
	Archetype Group ID: org.glassfish.jersey.archetypes
	Archetype Artifact ID: jersey-quickstart-webapp
	Archetype Version: 2.16  