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


