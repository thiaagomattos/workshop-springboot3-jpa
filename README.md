# **Java Spring Boot CRUD Project**

This project was developed following a course on Udemy.

## **Project Overview**

This application is a **CRUD** (Create, Read, Update, Delete) system built in **Java** using **Spring Boot** and the **H2 in-memory database**. It models a simple e-commerce structure with the following entities:

1. **User**: Represents a user of the system.
2. **Order**: Represents an order placed by a user.
3. **Product**: Represents a product that can be added to an order.
4. **Category**: Categorizes the products.
5. **Payment**: Represents the payment details associated with an order.

## **Technologies Used**

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (in-memory database)
- **Postman** (for API testing)

## **How to Run the Project**

1. **Clone the Repository**:
     ```bash
   git clone https://github.com/your-repo-url


2. **Navigate to the Project Directory**:
    ```bash
    cd project-directory


3. **Run the Application**:
You can run the project using Maven or directly from your IDE. If you are using Maven, run:
   ```bash
    mvn spring-boot:run


4. **Access the H2 Console (optional)**:
  If you want to check the database contents, you can access the H2 console at:
    ```bash
    http://localhost:8080/h2-console
    
**JDBC URL**: jdbc:h2:mem:testdb

**Username**: sa

**Password**: (leave empty)


5. **Test the API using Postman**:
 You can use Postman (or any API client) to interact with the application. The base URL for the API is:
    ```bash
    http://localhost:8080/api

Here are some example endpoints:

**Get all users**: GET /users

**Get a user by ID**: GET /users/{id}

**Create a new user**: POST /users

**Update a user**: PUT /users/{id}

**Delete a user**: DELETE /users/{id}

## **Future Improvements**
Add user authentication and authorization (e.g., using Spring Security).
Implement validation for input data.
Expand unit testing coverage.

## **Dependencies**
Make sure to check the pom.xml for all dependencies used in this project, including Spring Boot, H2 Database, and other libraries.

## **Notes**
This is a learning project based on a Udemy course, so it focuses on demonstrating CRUD operations using Spring Boot with basic relations between entities.















