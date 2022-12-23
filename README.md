# Cinema-app 🎥
___
## 📝 Description
    This web-application demonstrates the functionality of working with users,tickets and shopping carts.
    It allows users (role - "USER") to find available movie session for sertain movie and time, add ticket 
    to the shopping cart, create an order with all added tickets. As an administrator (role - "ADMIN"), you 
    can add movies, cinama halls and movie sessions.
## 🧮 Features
___
- Application supports roles restrictions ("user" or "admin") 
- Users authentication and authorisation
- Creating movies, cinema halls, movie sessions
- Looking up available movie sessions
- Adding tickets to shopping cart and creating orders

## 🔨 Architecture
___
N-tire architecture - consists of 3-levels
#### Controllers layer ↔ DTO layer ↔ Services layer ↔ DAO layer

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

## ⏯ Running an application locally
1. Set db properties in db.properties
2. Configure tomcat
3. Run program 

## Entity relations diagram
![img.png](entity_Relations.png)