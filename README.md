# 🚀 Rate Limiter Spring Boot Service

This project provides a robust implementation of a **Rate Limiting** mechanism using Java, Spring Boot, and Resilience4j. It demonstrates how to protect service endpoints from being overwhelmed by traffic by applying rate-limiting annotations and handling fallback scenarios gracefully.

## 📑 Table of Contents
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Installation](#-installation)
- [Usage](#-usage)
- [Project Structure](#-project-structure)
- [API Reference](#-api-reference)
- [License](#-license)

## ✨ Features
- ✅ **Rate Limiting:** Protects API endpoints using Resilience4j's `@RateLimiter` annotation.
- 🛡️ **Fallback Mechanisms:** Configured to return a user-friendly message when rate limits are exceeded.
- 🏗️ **Spring Boot Architecture:** Follows industry-standard service/controller pattern.
- ☕ **Java 21 Support:** Built for modern Java development.

## 🛠️ Tech Stack
| Component | Technology |
| :--- | :--- |
| **Language** | Java 21 |
| **Framework** | Spring Boot 4.0.1 |
| **Resilience** | Resilience4j |
| **Build Tool** | Maven |

## ⚙️ Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/IsharaDeshan6/rate-limiter
   ```
2. Navigate to the project directory:
   ```bash
   cd rate-limiter
   ```
3. Build the project using the Maven wrapper:
   ```bash
   ./mvnw clean install
   ```
4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

## 🚀 Usage
The application exposes REST endpoints designed to demonstrate rate-limited responses. When the limit is hit, the application automatically triggers the fallback method defined in `WeatherServiceImpl`.

**Example Request:**
`GET http://localhost:8080/api/v1/weather?city=London`

## 📂 Project Structure
```text
src/main/java/com/ishara/ratelimiter/
├── controller/    # REST API controllers
├── service/       # Business logic interfaces
│   └── impl/      # Service implementation with @RateLimiter
└── RateLimiterApplication.java # Entry point
```

## 📡 API Reference
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| GET | `/api/v1/weather` | Gets weather data (Rate limited) |
| GET | `/api/v1/weather/moreWeather` | Gets detailed weather (Rate limited) |

## 📜 License
This project is currently unlicensed.

---
Made with ❤️ by [IsharaDeshan6](https://github.com/IsharaDeshan6). 
If you found this useful, please ⭐ the repository!

