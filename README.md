# LuxeScent Online Store

## **1. Project Vision**

An elegant online perfume store where customers can browse, search, and purchase perfumes easily, with a secure checkout.

**Target Audience:** Perfume lovers, gift shoppers, and fragrance collectors.

**Goals:**

* Simple, fast, and mobile-friendly interface
* Secure payment processing
* Easy product management for the owner



## **2. Tech Stack**

* **Frontend:** HTML, CSS, JavaScript
* **Backend:** Java (Servlets or Spring Boot)
* **Database:** MySQL
* **Payments:** PayPal, Mobile Money (via API)
* **Hosting:** Apache Tomcat (backend), domain hosting for frontend



## **3. Core Features**

* Homepage with featured perfumes
* Shop page with categories & filters
* Product detail page
* Shopping cart
* Checkout with payment gateway
* User registration & login
* Admin dashboard (manage products & orders)



## **4. Pages & Navigation**

1. **Home**
2. **Shop**
3. **Product Details**
4. **Cart**
5. **Checkout**
6. **Login/Register**
7. **Admin Dashboard**
8. **Contact/About**


# **5 Application Layer (Backend in Java)**

Technologies: Spring Boot

Purpose: Handles business logic, interacts with the database, manages sessions, processes payments.

**Modules:**

Authentication Module: Handles user login, registration, and session management.

Product Module: Manages product listing, details, and filtering.

Cart Module: Stores cart items, updates quantities, and calculates totals.

Order Module: Processes orders, stores order details, updates status.

Payment Module: Integrates PayPal/Mobile Money APIs, handles transactions.

Admin Module: Allows admins to add/edit/delete products, view orders, and update statuses.



## **5. Database Design**

**Tables:**

* Users (id, name, email, password, role)
* Products (id, name, description, price, category, image)
* Orders (id, user\_id, date, total\_amount, status)
* Order\_Items (id, order\_id, product\_id, quantity, price)
* Categories (id, name)



## **6. System Flow**


**User:** Browse → Add to Cart → Checkout → Payment → Order Confirmation

**Admin:** Login → Manage Products → View Orders → Update Status
# Use case
<img width="1177" height="1376" alt="Use case diagram" src="https://github.com/user-attachments/assets/eaf83cb0-edd6-4f1e-873d-971eae81ae7e" />




## **7. Design Style**

* Colors: Soft gold, cream, white, and black accents
* Fonts: Elegant serif for headings, clean sans-serif for body text
* Layout: Minimal, centered, high-quality perfume images



## **8. Development Plan**

**Week 1:** Setup project structure & database schema

**Week 2:** Build static HTML/CSS pages

**Week 3:** Connect frontend to Java backend (Servlets/Spring Boot)

**Week 4:** Implement cart & checkout logic

**Week 5:** Integrate payment gateway
**Week 6:** Testing, bug fixes, and launch


