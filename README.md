# CourseRegistrationSystem

A full-stack web application that allows students to register for available courses and view their registrations.
Built using Spring Boot (Backend), HTML, CSS, JavaScript (Frontend), and MySQL (Database).

⚙️ Backend Configuration

File: backend/src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/course_reg_sys
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

🔍 Explanation

spring.datasource.url — MySQL database connection URL

spring.datasource.username — Database username

spring.datasource.password — Database password

spring.jpa.hibernate.ddl-auto=update — Automatically creates or updates tables from entities

spring.jpa.show-sql=true — Displays executed SQL queries in the console

spring.jpa.properties.hibernate.dialect — Tells Hibernate to use the MySQL dialect

🚀 How to Run the Project
🖥️ Backend Setup

1. Open the backend folder in your preferred IDE (e.g., IntelliJ, Eclipse, VS Code with Java extension).

2. Ensure MySQL is running and the database course_reg_sys is created.

3. Update credentials in application.properties.

4. Run the Spring Boot application using Maven wrapper commands:
./mvnw spring-boot:run

or on Windows:

mvnw.cmd spring-boot:run

5.The backend will start on http://localhost:8080

🌐 Frontend Setup

1. Open the frontend folder in VS Code (or any editor).

2. Open index.html in a browser or use the Live Server extension.

The frontend communicates with backend APIs at http://localhost:8080


🧠 Features

🔸 View available courses

🔸 Register for courses

🔸 View registered students

🔸 Add and delete courses

🔸 Automatic table creation via Hibernate

🛠️ Tech Stack
Backend	- Spring Boot, Java
Frontend - HTML, CSS, JavaScript
Database	- MySQL
Tools	- IntelliJ IDEA, VS Code, Maven,postman
