🧾 Order Management System — Spring Boot + JPA
📌 Project Overview

This is a simple Spring Boot Order Management System built using Spring Data JPA and MySQL.
It demonstrates CRUD operations for managing items (add, view, update, delete) and follows a layered architecture — Controller → Service → Repository.

The project is designed for beginners who want to understand how to build RESTful APIs using Spring Boot and integrate them with a relational database.

⚙️ Tech Stack
Layer	Technology
Language	Java 17+
Framework	Spring Boot 3+
ORM	Spring Data JPA
Database	MySQL
Build Tool	Maven
IDE	Eclipse / IntelliJ IDEA
Version Control	Git & GitHub
🧩 Project Structure
src/
 └── main/
     ├── java/com/flm/
     │    ├── controller/
     │    │    └── ItemController.java
     │    ├── service/
     │    │    ├── ItemService.java
     │    │    └── ItemServiceImpl.java
     │    ├── repository/
     │    │    └── ItemRepository.java
     │    ├── model/
     │    │    ├── Item.java
     │    │    ├── ItemRequestDto.java
     │    │    └── ItemResponseDto.java
     │    └── OrderManagementApplication.java
     └── resources/
          ├── application.properties
          └── static / templates (if any)

🧠 Features

✅ Add new items
✅ Fetch all items
✅ Fetch item by ID
✅ Update existing item
✅ Delete item
✅ DTOs used for request/response handling
✅ Layered architecture for maintainability

⚙️ Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/TejanyaKumar/SpringJPAProject-OrderManagement.git
cd SpringJPAProject-OrderManagement

2️⃣ Configure Database

Open application.properties and update your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/orderdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Build & Run
mvn clean install
mvn spring-boot:run

📬 API Endpoints
Method	Endpoint	Description
POST	/items	Add a new item
GET	/items	Fetch all items
GET	/items/{id}	Fetch item by ID
PUT	/items/{id}	Update item
DELETE	/items/{id}	Delete item

📌 Use Postman or any REST client to test these APIs.

🧾 Sample JSON Request
{
  "name": "Keyboard",
  "description": "Wireless Mechanical Keyboard",
  "price": 2499.0
}

🖼️ Optional Additions

Add screenshots of running project in a folder named screenshots/.

Include a Postman collection (OrderManagement.postman_collection.json).

👨‍💻 Author

Tejanya Kumar J
