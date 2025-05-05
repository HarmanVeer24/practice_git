# 💰 Crypto Wallet Application — Spring Boot + JWT + Crypto API  

Welcome to the **Crypto Wallet** application — a Spring Boot-powered backend service for managing crypto holdings, setting price alerts, and generating reports.

This API-first application uses **JWT-based authentication**, **Spring Security**, and integrates with external coin price APIs for real-time price tracking.

---

## 📦 Tech Stack  

- Java 17  
- Spring Boot  
- Spring Security  
- JWT (JSON Web Tokens)  
- JPA / Hibernate (MySQL)  
- Quartz Scheduler (for alerting)  
- iTextPDF, Apache POI (for report generation)  
- Postman (for API testing)  

---

## 🚀 Getting Started  

### ✅ Prerequisites  

- Java 17+  
- Maven  
- MySQL  

---


## 🛠️ Project Setup  

### 1️⃣ Clone the Repository  

```bash
git clone https://github.com/yourusername/crypto-wallet.git
cd crypto-wallet
```

### 2️⃣ Configure Database  

Update your MySQL credentials and database URL inside:

```properties
src/main/resources/application.properties
```

### 3️⃣ Install Dependencies & Build the Project  

```bash
mvn clean install
```

### 4️⃣ Run the Application  

```bash
mvn spring-boot:run
```

## 📊 API Workflow  

⚠️ All APIs are tested via **Postman**. No frontend integrated yet.  
⚠️ **Token must be manually passed via the Authorization header as:**

```http
Bearer {token}
```


