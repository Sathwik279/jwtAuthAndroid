# Custom JWT Authentication System (Ktor, MongoDB, Android)

## Overview
This project demonstrates how to build a custom authentication system using **Ktor** for the backend, **MongoDB** for the database, and integrates with an **Android** application. It provides a flexible alternative to Firebase Authentication by utilizing **JWT (JSON Web Tokens)** for secure user authentication.

## Features
- User sign-up and sign-in with password hashing.
- JWT-based authentication and token generation.
- Integration with Android for token handling and secure routes.
- MongoDB Atlas for storing user data.

## Technologies
- **Backend:** Ktor, Kotlin
- **Database:** MongoDB (MongoDB Atlas)
- **Authentication:** JWT (JSON Web Token)
- **Android:** Kotlin, Jetpack Compose, Retrofit, Dagger Hilt

## Prerequisites
Before you begin, ensure you have the following installed:
- **Ktor Backend:**
  - IntelliJ IDEA (or any Kotlin-supported IDE)
  - Kotlin
  - Gradle
  - MongoDB Atlas account
- **Android App:**
  - Android Studio
  - Jetpack Compose
  - Retrofit
  - Dagger Hilt

## Backend Setup (Ktor + MongoDB)

### 1. Clone Repository
Clone the repository to your local machine:
```bash
git clone https://github.com/your-username/jwt-authentication-project.git
