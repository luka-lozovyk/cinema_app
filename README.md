# Cinema-app 🎥
___
## 📝 Description
    This web-application demonstrates the functionality of working with users, tickets and shopping carts.
    It allows users (role - "USER") to find available movie session for sertain movie and time, add ticket 
    to the shopping cart, create an order with all added tickets. As an administrator (role - "ADMIN"), you 
    can add movies, cinama halls and movie sessions, also find other users by email.
## 🧮 Features
___
- Application supports roles restrictions ("user" or "admin") 
- Users authentication and authorisation
- Creating movies, cinema halls, movie sessions
- Looking up available movie sessions
- Adding tickets to shopping cart and creating orders

## 🔨 Architecture
___
N-tire architecture
#### Controllers layer ↔ DTO layer ↔ Services layer ↔ DAO layer ↔ Models 

## 💻 Technologies:
___
| **Technology** | **Version** |
|----------------|-------------|
| JDK            | 17          |
| Maven          | 4.0.0       |
| Spring         | 5.3.20      |
| Hibernate ORM  | 5.6.14      |
| MySQL          | 8.0.22      |
| Tomcat         | 9.0.50      |

## ⚙️Set up and run an application locally
1. Install Tomcat 9.0.50 and MySql.
2. Set db properties in [/resources/db.properties](https://github.com/luka-lozovyk/cinema_app/blob/ef5ea2e57b04167de0094641530132507bb4bfc0/cinema_app/src/main/resources/db.properties#L1).
3. Run the following query to create the schema: *CREATE SCHEMA IF NOT EXISTS 'cinema-app` DEFAULT CHARACTER SET utf8;*.
4. Run program with Tomcat local server 9.0.50.
5. 1 Admin and 1 user are already injected. You can log in as admin or as user and test the application.
6. For PUT, POST, DELETE Http requests Postman can be used.

## Entity relations diagram
![img.png](entity_Relations.png)