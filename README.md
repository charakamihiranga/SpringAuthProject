# Spring Security & OAuth2 Projects

This repository contains two Spring Boot projects demonstrating different authentication mechanisms:

## Spring Security with JWT Authentication

This project implements a Spring Boot application secured with JSON Web Tokens (JWT). 

Features:

* User registration and login
* JWT generation and validation
* Custom JWT filter for authentication
* Secure API endpoints
* Role-based access control (future extension)

Setup:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/spring-security-oauth2.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd spring-security-oauth2/spring-security-jwt
   ```

3. **(Optional) Configure database access in `application.properties`.**

4. **Build and run the project:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

API Endpoints:

* POST /register: Register a new user with username and password (JSON payload).
* POST /login: Login with username and password to receive a JWT token.
* GET /students: Protected endpoint requiring a JWT token in the Authorization header.

## Spring Security with OAuth2 Authentication

This project demonstrates OAuth2 authentication with external providers like Google and GitHub.

**Features:**

* OAuth2 login with Google and GitHub
* Secure API endpoints
* Access control to protected resources
* User authentication via OAuth2 tokens

**Setup:**

1. **Clone the repository** as mentioned above.

2. **Navigate to the `spring-oauth2` directory.**

3. **Configure OAuth2 credentials in `application.properties`:**

   **Google OAuth2:**
   ```properties
   spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
   spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET
   ```

   **GitHub OAuth2:**
   ```properties
   spring.security.oauth2.client.registration.github.client-id=YOUR_GITHUB_CLIENT_ID
   spring.security.oauth2.client.registration.github.client-secret=YOUR_GITHUB_CLIENT_SECRET
   ```

4. **Build and run the project:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

**API Endpoints:**

* **GET /:** Returns a welcome message after successful OAuth2 login.
* **OAuth2 Login:** Clicking the provided links redirects users to the respective provider's login page.

**Shared Configuration:**

Both modules use the following core dependencies:

* Spring Boot
* Spring Security
* Spring Data JPA (for JWT project)
* OAuth2 Client (for OAuth2 project)
* JSON Web Token (for JWT project)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
  
