
---

# 🚗 Automatic Number Plate Recognition (ANPR) - Android App

This is a **real-time vehicle number plate recognition Android application** built with **TensorFlow Lite**, **Firebase**, and **EasyOCR**. The app captures number plates through the mobile camera, extracts text, stores logs on the cloud, and provides history & report features for traffic, security, and monitoring purposes.

📱 App UI Screenshots
🏠 Home Page & 🔐 Register Page
<div align="center"> <img src="https://github.com/user-attachments/assets/de86d058-0500-4bca-865f-f776c179a037" alt="Home Page" width="250"/> &nbsp; &nbsp; &nbsp; <img src="https://github.com/user-attachments/assets/d7948b77-a57e-4c8c-be47-1d2e6176a22f" alt="Register Page" width="250"/> </div>

---

## 📱 App Overview

The ANPR Android App allows users to:

* Detect vehicle number plates in real-time using the device camera.
* Extract the license plate number as text.
* Save detection logs (plate number, timestamp, image) to Firebase.
* View past detections with search & filtering.
* Generate PDF reports of detections.
* Get push notifications for detected plates.
* Access data across devices with secure login.

---

## 🛠️ Features Breakdown

### 🔴 Real-time Detection

* Open app → Live camera view.
* Bounding box around detected plates.
* Detected number plate text shown on screen.

### 🔡 OCR Text Extraction

* Extracts alphanumeric plate numbers from detected regions.
* Uses EasyOCR integrated into the app workflow.

### ☁️ Firebase Cloud Integration

* **Realtime Database**: Saves detection logs (plate number, time, etc.).
* **Firebase Storage**: Uploads and stores captured plate images.
* **Firebase Authentication**: User login & access control.
* **Firebase Cloud Messaging (FCM)**: Sends notifications on new detections.

### 🗂️ Detection Logs & History

* View list of all detected plates.
* Includes date, time, plate number & image.
* Search logs by date or plate number.

### 📝 Report Generation

* Select detection logs.
* Export detection data as a PDF.
* Share reports via email, WhatsApp, etc.

### 🔐 Secure User Management

* Firebase Authentication for login/signup.
* User-specific data isolation.

---

## 🚀 How to Use the App

1. **Login / Signup** using Firebase Authentication.
2. **Start Camera** to detect number plates in real-time.
3. **View Detected Plate Number** immediately on-screen.
4. **Save Detection** (auto-uploaded to Firebase).
5. **Go to History Section** to see past detections.
6. **Generate PDF Report** from selected logs.
7. **Receive Notifications** for new detections.

---

## 🔑 Required Permissions

* Camera Access
* Internet Access
* Storage Access (for PDF exports)

---

## 🛡️ Security

* All data is stored securely in Firebase.
* User-specific access control for detection logs.
* Firebase rules ensure data privacy.
