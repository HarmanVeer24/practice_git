## 🛠️ Project Setup  

### 1️⃣ Clone the Repository  

```bash
git clone https://github.com/yourusername/crypto-wallet.git
cd crypto-wallet
2️⃣ Configure Database
Update your MySQL credentials and database URL inside:

properties
Copy
Edit
src/main/resources/application.properties
3️⃣ Install Dependencies & Build the Project
bash
Copy
Edit
mvn clean install
✅ This ensures a clean build and minimizes dependency issues.

4️⃣ Run the Application
bash
Copy
Edit
mvn spring-boot:run
📊 API Workflow
⚠️ All APIs are tested via Postman. No frontend integrated yet.
⚠️ Token must be manually passed via Authorization header as:

http
Copy
Edit
Bearer {token}
📌 User Flow
🔐 Register
http
Copy
Edit
POST http://localhost:8080/register
Registers a new user into the database.

🔐 Login
http
Copy
Edit
POST http://localhost:8080/login
Returns a JWT token in the response body.
📌 Use this token for all secured API calls.

🔑 User Functional APIs (Require Token)
Delete Profile

http
Copy
Edit
DELETE http://localhost:8080/deleteUser
Change Password

http
Copy
Edit
PUT http://localhost:8080/changePassword
Update Profile

http
Copy
Edit
PUT http://localhost:8080/updateUser
🛠️ Forgot & Reset Password (No Token Required)
Forgot Password

http
Copy
Edit
POST http://localhost:8080/forget-password
Reset Password

http
Copy
Edit
PUT http://localhost:8080/reset-password
📈 Crypto Holdings APIs
Add Holding

http
Copy
Edit
POST http://localhost:8080/api/wallet
Example JSON:

json
Copy
Edit
{
  "coinName": "Ethereum",
  "coinSymbol": "ETH",
  "coinUnits": 2,
  "coinPrice": 3200,
  "purchaseDate": "2025-05-04"
}
Get All Holdings

http
Copy
Edit
GET http://localhost:8080/api/wallet
Update Holding by ID

http
Copy
Edit
PUT http://localhost:8080/api/wallet/{id}
Delete Holding by ID

http
Copy
Edit
DELETE http://localhost:8080/api/wallet/{id}
📣 Alerts APIs
Create Alert

http
Copy
Edit
POST http://localhost:8080/alerts/create-alert
Update Alert by ID

http
Copy
Edit
PUT http://localhost:8080/alerts/{id}
Get All Active Alerts

http
Copy
Edit
GET http://localhost:8080/alerts/active
📊 Price API
Get Current Price (Manual Check)

http
Copy
Edit
GET http://localhost:8080/api/price/{coinSymbol}
Example:

http
Copy
Edit
GET http://localhost:8080/api/price/eth
📋 Summary & Report Generation
Get Portfolio Summary

http
Copy
Edit
GET http://localhost:8080/api/summary
Generate Report (PDF / Excel)

http
Copy
Edit
GET http://localhost:8080/api/report/export
Example Query Parameter:

ini
Copy
Edit
format=pdf
Token required in Authorization header.

🛡️ Admin APIs (Restricted to ADMIN Role)
Get All Users

http
Copy
Edit
GET http://localhost:8080/admin/get-all-users
Delete User by ID

http
Copy
Edit
DELETE http://localhost:8080/admin/delete-user/{id}
📮 Authentication Flow
1️⃣ User logs in → receives a JWT token
2️⃣ Token must be passed in the header:

http
Copy
Edit
Authorization: Bearer {token}
3️⃣ Spring Security + JWT filters validate token & role-based access

📮 Postman Collection
👉 Postman Collection Coming Soon
(or drop a link here when available)

📊 Example Requests
📩 Example Login Request
http
Copy
Edit
POST http://localhost:8080/login
Example JSON

json
Copy
Edit
{
  "email": "user@gmail.com",
  "password": "user@123"
}
📬 Example Login Response
json
Copy
Edit
{
  "message": "User has successfully logged in. Here is the generated token:",
  "data": "eyJhbGciOiJIUzI1NiJ9..."
}
pgsql
Copy
Edit

---
