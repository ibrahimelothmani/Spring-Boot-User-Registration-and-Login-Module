# 1. Spring Boot User Registration and Login System

A comprehensive user authentication system built with Spring Boot, Spring Security, Hibernate, and Thymeleaf.

## 🚀 Features

- **User Registration**: Secure user registration with validation
- **User Authentication**: Login/logout functionality with Spring Security
- **Role-based Access Control**: Admin role management
- **Password Encryption**: BCrypt password encoding
- **Responsive UI**: Modern Thymeleaf templates with Tailwind CSS
- **Database Integration**: MySQL database with Hibernate ORM
- **Form Validation**: Server-side validation with error handling

## 🛠️ Technologies Used

- **Backend**: Spring Boot 3.5.0, Spring Security 6, Spring Data JPA
- **Frontend**: Thymeleaf, Tailwind CSS
- **Database**: MySQL 8.0+
- **Build Tool**: Maven
- **Java Version**: 21+
- **Additional**: Lombok, Hibernate, Bean Validation

## 📋 Prerequisites

- Java 21 or higher
- Maven 3.6+
- MySQL 8.0+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### 2. Database Setup
```
CREATE DATABASE login_system;
```
### 3. Configure Database
Update src/main/resources/application.yaml :

### 4. Build and Run
### 5. Access the Application
- Open your browser and navigate to: http://localhost:8080/index
- Register a new user or login with existing credentials

## 🔐 Security Features
- Password Encryption : Uses BCrypt for secure password hashing
- CSRF Protection : Disabled for API endpoints (can be enabled)
- Role-based Authorization : Admin role required for user management
- Session Management : Secure session handling with Spring Security
## 📱 Available Endpoints
Endpoint Method Description Access /index GET Home page Public /register GET/POST User registration Public /login GET/POST User login Public /users GET List all users Admin only /logout POST User logout Authenticated

## 🎨 UI Screenshots
The application features a modern, responsive design with:

- Clean registration and login forms
- Error handling and validation messages
- Professional navigation bar
- Gradient backgrounds and modern styling
## 🔧 Configuration
### Database Configuration
- Database : MySQL
- JPA/Hibernate : Auto DDL update enabled
- Connection Pool : HikariCP (default)
### Security Configuration
- Authentication : Form-based login
- Authorization : Role-based access control
- Password Encoding : BCrypt
## 🚀 Deployment
### Local Development
### Production Build
## 🤝 Contributing
1. Fork the repository
2. Create a feature branch ( git checkout -b feature/amazing-feature )
3. Commit your changes ( git commit -m 'Add some amazing feature' )
4. Push to the branch ( git push origin feature/amazing-feature )
5. Open a Pull Request
## 📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

## 👨‍💻 Author
Ibrahim - https://ibrahimelothmani.vercel.app/

## 🙏 Acknowledgments
- Spring Boot team for the excellent framework
- Spring Security for robust authentication
- Thymeleaf for server-side templating
- Tailwind CSS for modern styling
