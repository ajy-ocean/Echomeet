# EchoMeet

EchoMeet is a modern web application built with Spring Boot and a JavaScript frontend, designed to provide a seamless user authentication system integrated with video-related functionality. The application allows users to register, log in, log out, and manage their profiles, with a robust backend and a responsive frontend. EchoMeet aims to deliver a scalable and secure platform for video-based interactions, such as video conferencing or streaming.

## Table of Contents
- [Features](#features)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Installation](#installation)

## Features
- **User Authentication**: Secure registration, login, and logout functionality with case-sensitive email validation.
- **RESTful API**: Built with Spring Boot, providing endpoints for user management.
- **Frontend Interface**: A JavaScript-based login form for user interaction.
- **Video Functionality**: [Placeholder: Add specific video features, e.g., real-time video conferencing, video streaming, or video call management].
- **Error Handling**: Robust error handling for invalid inputs and authentication failures.
- **Cross-Origin Support**: Configured with CORS to allow seamless frontend-backend communication.

## Technologies
- **Backend**:
  - Java 17
  - Spring Boot 3.x
  - Lombok (for reducing boilerplate code)
  - Maven (dependency management)
- **Frontend**:
  - JavaScript (Vanilla JS for the login form)
  - HTML/CSS
- **Development Tools**:
  - Postman (for API testing)
  - IntelliJ IDEA or VS Code (recommended IDEs)
  - Git (version control)

## Prerequisites
- Java 17 or higher
- Maven 3.8.x or higher
- Node.js (optional, if extending the frontend)
- A modern web browser (e.g., Chrome, Firefox)
- Postman (for testing API endpoints)
- Git (for cloning the repository)

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/echomeet.git
   cd echomeet
   ```

2. **Backend Setup**:
   - Ensure Java 17 and Maven are installed.
   - Navigate to the project root and install dependencies:
     ```bash
     mvn clean install
     ```