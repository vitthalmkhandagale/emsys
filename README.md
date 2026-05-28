# Employee Management System

A Full Stack Employee Management System developed using:

- React.js
- Spring Boot
- MySQL
- Docker
- Docker Compose

---

# Technologies Used

## Frontend
- React.js
- Axios
- Bootstrap
- JavaScript
- JSX

## Backend
- Spring Boot
- Spring Data JPA
- Hibernate
- REST API
- Maven

## Database
- MySQL

## DevOps / Containerization
- Docker
- Docker Compose

---

# Features

## Employee Operations
- Add Employee
- Get All Employees
- Update Employee
- Delete Employee

## Frontend Features
- Employee Table UI
- API Integration using Axios
- React Hooks (`useState`, `useEffect`)
- Responsive Bootstrap Design

## Backend Features
- REST APIs
- Layered Architecture
- DTO & Mapper Pattern
- JPA Repository

---
# 📸 Application Screenshots

## Employee List Page

<p align="center">
  <img width="1913" height="901" alt="allemployees" src="https://github.com/user-attachments/assets/6f1f0b95-1a02-492b-b536-df8e87bab185" />

</p>

---

## Add Employee Page

<p align="center">
  <img src="" width="900"/>
</p>

---

## Update Employee Page

<p align="center">
  <img src="" width="900"/>
</p>

---

## Docker Containers Running

<p align="center">
  <img src="" width="900"/>
</p>

---
# 📸 Application Architecture

```text
+----------------------+
|   User Browser       |
+----------+-----------+
           |
           | Access Application
           |
+----------v-----------+
|    React Frontend    |
|      Port: 3000      |
|  React + Axios + UI  |
+----------+-----------+
           |
           | Axios HTTP Requests
           |
+----------v-----------+
|   Spring Boot API    |
|      Port: 8080      |
| REST Controllers/API |
+----------+-----------+
           |
           | JPA / Hibernate
           |
+----------v-----------+
|      MySQL DB        |
|      Port: 3306      |
+----------------------+

```

# 🐳 Docker Architecture

```text
+------------------------------------------------------+
|                 Docker Compose                       |
+------------------------------------------------------+
            |                  |                 |
            |                  |                 |
+-----------v------+  +--------v-------+  +------v------+
|  ems-frontend    |  |  ems-backend   |  |   mysql-db  |
|     ReactJS      |  |  Spring Boot   |  |    MySQL    |
|    Port: 3000    |  |   Port: 8080   |  |  Port: 3306 |
+-----------+------+  +--------+-------+  +-------------+
            |                  |
            | Axios API Calls  |
            +------------------+
```
---

# 📌 Future Improvements

- JWT Authentication
- Role Based Access
- Swagger Documentation
- CI/CD Pipeline
- Kubernetes Deployment
- Cloud Deployment (AWS)

---

# 👨‍💻 Author

Sameer Dhumal

GitHub:
https://github.com/SameerDhumal08
