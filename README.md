📱 WhatsApp Chatbot Backend (Spring Boot)
🚀 Overview

This project is a simple backend simulation of a WhatsApp chatbot built using Java and Spring Boot.
It exposes a REST API that receives incoming messages and responds with predefined replies.

🧠 Features
Accepts incoming messages via REST API (/webhook)
Responds with predefined replies:
Hi → Hello
Bye → Goodbye
Default response for unknown messages
Logs all incoming messages in the console
Lightweight and easy to run locally
🛠️ Tech Stack
Java 17
Spring Boot 3.x
Maven
Lombok (optional)
Postman (for testing)
📡 API Endpoint
🔹 POST /webhook
Request Body:
{
  "message": "Hi"
}
Response:
{
  "reply": "Hello"
}
🔄 Supported Messages
Input Message	Response
Hi	Hello
Bye	Goodbye
Others	I don't understand
▶️ How to Run Locally
Clone the repository:
git clone https://github.com/your-username/your-repo-name.git
Navigate to project folder:
cd your-repo-name
Run the application:
mvn spring-boot:run
Server will start at:
http://localhost:8080
🧪 Testing with Postman
Method: POST
URL:
http://localhost:8080/webhook
Body (JSON):
{
  "message": "Hi"
}
🖥️ Console Logs

Example log:

Received message: Hi


🌐 Deployment (Optional)

This project can be deployed on platforms like:
Railway
whatsappchatbotassignment-production.up.railway.app

📌 Future Improvements
Add more chatbot responses
Integrate real WhatsApp API
Add database for chat history
Improve NLP-based responses
🙌 Author

Mohd Zaid

📄 License

This project is for educational purposes.


Mohd zaid
https://github.com/ZaidTech87/WhatsApp_chatbot_Assignment
