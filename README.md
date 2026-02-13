# Item Management REST API

## Overview

This project is a simple Spring Boot REST API application that manages a collection of items using in-memory storage. It demonstrates RESTful API design, input validation, exception handling, and API documentation using Swagger.

---

## Technologies Used

* Java 17
* Spring Boot
* Maven
* Spring Validation
* Swagger (OpenAPI)

---

## How to Run the Application

1. Clone or download the project.

2. Open the project in Eclipse or any Java IDE.

3. Run the main class:

   ItemApiApplication.java

   or using Maven:

   mvn spring-boot:run

4. Once the application starts, open:

   Swagger UI:
   http://localhost:8080/swagger-ui/index.html

---

## API Endpoints

### 1. Add a new item

**POST /items**

Adds a new item to the in-memory list.

Example request body:

{
"name": "Laptop",
"description": "Gaming laptop"
}

---

### 2. Get all items

**GET /items**

Returns a list of all stored items.

---

### 3. Get item by ID

**GET /items/{id}**

Returns a single item using its ID.

Example:
GET /items/1

---

## Input Validation

The application validates incoming requests using Spring Validation.

* The item name field is required.
* If invalid data is sent, a custom error response is returned.

Example validation error:

{
"name": "Name is required"
}

---

## Implementation Details

* Items are stored in memory using an ArrayList.
* Data resets when the application restarts.
* A service layer manages business logic.
* A global exception handler provides clean error messages.
* Swagger UI is used for interactive API testing.

---

## Notes

This project is intended as a demonstration backend API and does not include a database or frontend interface.
