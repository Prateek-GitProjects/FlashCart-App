##📱 Flash Cart

Flash Cart is a modern, user-friendly Android shopping application built with Kotlin and Jetpack Compose.
Designed to simulate a real-world e-commerce experience, it enables users to securely log in using OTP-based phone authentication, browse products by category, add items to a cart, and manage their shopping with an intuitive, clean interface.

The app follows the MVVM architecture to ensure clear separation of concerns and maintainable code.
It features a responsive UI adhering to Material Design principles, dynamic state management, and robust error handling for offline scenarios.
Flash Cart demonstrates core Android development practices—including Firebase Authentication integration—and serves as a strong foundation for building more advanced, production-ready shopping apps in the future.

##🌟 Features
✅ OTP-based login with Firebase Authentication
✅ Modern UI with Jetpack Compose
✅ Category-based product browsing
✅ Interactive cart system with dynamic updates
✅ Error screen for internet connectivity issues
✅ MVVM architecture for clean separation of concerns
✅ Logout with confirmation dialog

##🎯 Screens & Flow

###-Login Screen
   - OTP-based authentication using Firebase
   - Mobile number verification with one-time password
   - Smooth, password-free user onboarding

###-Home Screen (Categories)
   - Responsive grid layout of product categories
   - Material Design styling
   - Easy navigation to items

###-Error Screen
   - Handles no-internet scenarios gracefully
   - Displays clear warning message
   - Items Screen

###-View products within a selected category
   - Card layouts with image, name, price, and Add to Cart button
   - Cart Screen
   - Shows added items with quantity and total price
   - Allows reviewing and managing cart before checkout
   - Logout Confirmation
   - Prevents accidental logouts with a confirmation dialog

##🛠️ Tech Stack
Language: Kotlin

Architecture: MVVM (Model-View-ViewModel)

UI Framework: Jetpack Compose

Backend: Firebase Authentication

Build System: Gradle

IDE: Android Studio

##🧩 Architecture Overview
Flash Cart uses the MVVM pattern for clear separation of concerns:

Model: Data sources and business logic

ViewModel: UI-related data management using StateFlow / LiveData

View: UI screens implemented with Jetpack Compose

##✨ Jetpack Compose Highlights

Declarative UI with @Composable functions

State management via collectAsState()

Material Design components (Card, Button, TextField)

Responsive layouts (Column, Row, LazyVerticalGrid)

##🔐 Firebase Authentication
Phone number-based OTP login

Uses PhoneAuthProvider for sending OTP

Handles verification callbacks

Secure sign-in with PhoneAuthCredential

##📸 App Screenshots

###🔐 Login & OTP Verification



###🏠 Home / Category Display



###⚠️ Error Screen



###🛍️ Items Screen



###🛒 Cart Screen



###🚪 Logout Confirmation



##🚀 Getting Started

###1️⃣ Clone the repository:
git clone https://github.com/yourusername/flash-cart.git

###2️⃣ Open in Android Studio.

###3️⃣ Connect your Firebase project:

Enable Phone Authentication in Firebase Console.

Add your google-services.json to the app/ directory.

###4️⃣ Build & run the app on an emulator or Android device.

##🧭 Future Scope
This project is an MVP (Minimum Viable Product) demo with scope for enhancements:

✅ Payment gateway integration (e.g., Razorpay, Google Pay)

✅ User profile management (purchase history, personal details)

✅ Admin dashboard for managing products, offers, and orders

✅ Real-time backend integration (Firebase Firestore or Room DB)

✅ Notifications, order tracking, and more
