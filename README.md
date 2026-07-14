# Automate-Add-to-cart-option-Daraz


## 📌 Project Overview

This project automates an end-to-end e-commerce shopping workflow using Selenium WebDriver and Java. The automation script simulates a real user's journey from searching for a product to successfully adding it to the shopping cart.

The project was developed as a hands-on Software Quality Assurance (QA) automation exercise to gain practical experience with Selenium WebDriver and web application testing.

---

## 🚀 Automated Test Scenario

The automation script performs the following actions:

1. Open the e-commerce website.
2. Search for a product using the search bar.
3. Select the relevant product from the search results.
4. Retrieve and display product details.
5. Verify product attributes:
   - Color: Silver
   - Storage: 256GB
6. Add the product to the cart if the required variant is available.
7. Handle the confirmation pop-up after adding the product.
8. Navigate to the shopping cart.
9. Verify that the product has been successfully added.

---

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- ChromeDriver
- IntelliJ IDEA

---

## 📚 Concepts Practiced

- Selenium WebDriver Automation
- Web Element Locators (XPath, ID, Name)
- Dynamic Element Handling
- Conditional Validation
- Pop-up Handling
- Explicit Waits (WebDriverWait)
- E-Commerce Workflow Testing
- End-to-End Test Automation

---

## 📂 Project Structure

```
src
 └── test
      └── AddItemToCart.java
```

---

## ▶️ How to Run

### Prerequisites

- Java JDK 21 or later
- Maven
- Google Chrome Browser
- Compatible ChromeDriver
- IntelliJ IDEA (Optional)

### Steps

1. Clone the repository:

```bash
git clone https://github.com/navodh99/Automate-Add-to-cart-option-Daraz.git
```

2. Open the project in IntelliJ IDEA.

3. Install project dependencies.

4. Run the TestNG test class.

---

## 📸 Test Flow

```
Login → Search Product → Select Product
      ↓
Validate Product Variant
      ↓
Add To Cart
      ↓
Handle Pop-up
      ↓
Open Cart
      ↓
Verify Product
```

---

## 🎯 Learning Outcome

Through this project, I gained practical experience in automating real-world e-commerce scenarios, handling dynamic web elements, validating business conditions, and improving my understanding of Software Quality Assurance (QA) automation testing.

---

## 👨‍💻 Author

Navoda Karunarathne


