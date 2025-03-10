Custom JWT Authentication System (Ktor, MongoDB, Android)
Overview
This project demonstrates how to build a custom authentication system using Ktor for the backend, MongoDB for the database, and integrates with an Android application. It provides a flexible alternative to Firebase Authentication by utilizing JWT (JSON Web Tokens) for secure user authentication.

Features
User sign-up and sign-in with password hashing.
JWT-based authentication and token generation.
Integration with Android for token handling and secure routes.
MongoDB Atlas for storing user data.
Technologies
Backend: Ktor, Kotlin
Database: MongoDB (MongoDB Atlas)
Authentication: JWT (JSON Web Token)
Android: Kotlin, Jetpack Compose, Retrofit, Dagger Hilt
Prerequisites
Before you begin, ensure you have the following installed:

Ktor Backend:
IntelliJ IDEA (or any Kotlin-supported IDE)
Kotlin
Gradle
MongoDB Atlas account
Android App:
Android Studio
Jetpack Compose
Retrofit
Dagger Hilt
Backend Setup (Ktor + MongoDB)
1. Clone Repository
Clone the repository to your local machine:

bash
Copy
Edit
git clone https://github.com/your-username/jwt-authentication-project.git
2. Install Dependencies
In your build.gradle.kts file, include the following dependencies:

Ktor server (Netty)
KMongo (MongoDB driver)
JWT library
Apache Commons Codec for password hashing
3. Set Up MongoDB Atlas
Create an Account: Sign up for a free account at MongoDB Atlas.
Create a Cluster: Set up a free cluster and choose a cloud provider close to your location.
Create Database and User: Create a database and a user with the necessary permissions.
Connect to Database: Copy the connection string provided by MongoDB Atlas and use it in your Application.kt file.
4. Implement Authentication Logic
Use SHA-256 hashing with salt for storing passwords securely.
Implement JWT token generation and verification for user authentication.
5. Configure Routes
Set up routes for user sign-up, sign-in, and token validation using JWT.
Protect routes using Ktor’s authentication plugin.
6. Running the Backend
To run the backend locally, use:

bash
Copy
Edit
./gradlew run
Android App Integration
1. Clone Android Repo
Clone the Android app repository:

bash
Copy
Edit
git clone https://github.com/your-username/android-app.git
2. Add Dependencies
In your build.gradle file, add:

Retrofit
Jetpack Compose
Dagger Hilt
3. Implement API Interface
Create a Retrofit interface to communicate with the backend (e.g., /signup, /signin, /authenticate).
4. Create AuthRepository & ViewModel
Handle user authentication logic and JWT token storage in the AuthRepository and AuthViewModel.
5. Design UI
Build the UI using Jetpack Compose with fields for username and password.
Display results (e.g., success or error) and manage navigation based on authentication state.
6. Store JWT Token
Securely store the JWT token in SharedPreferences after a successful login.
7. Running the Android App
Connect the Android app to your backend by configuring the base URL in your Retrofit instance.
Run the app on an emulator or device.
Deployment (Optional)
To deploy the backend to production:

Host the Ktor backend on a cloud service like Hostinger or another VPS.
Ensure MongoDB Atlas is correctly set up for production environments.
Update MongoDB Atlas IP access list to include your VPS IP.
