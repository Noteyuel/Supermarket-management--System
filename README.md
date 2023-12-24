# Supermarket Management System 
This Java project implements a simple supermarket Management system. It allows users to input details of products, calculates the total price, applies discounts, and generates an invoice. The program also stores the entered product details in a MySQL database.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Database Configuration](#database-configuration)
- [Contributors](#contributors)

  ## Introduction

This project is a console-based supermarket Management system that enables users to create an invoice for their purchases. It incorporates a product class for storing product details, a billing class for managing the billing process, and a MySQL database for storing product information.

## Features

- User-friendly console interface.
- Input customer details (name and address).
- Input product details (ID, name, quantity, price).
- Calculate total price and apply discounts.
- Display a formatted invoice.
- Store product details in a MySQL database.
 ## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed.
- MySQL database server installed.
## Usage
- Compile the Java program: javac ShoppingBill.java
- Run the compiled program: java ShoppingBill
## Database Configuration
- Ensure that your MySQL server is running.
- Modify the database connection parameters in the ShoppingBill.java file:
- Create a MySQL database named supermarket.
- Create a table named products with the following structure:
  CREATE TABLE IF NOT EXISTS products (
    id VARCHAR(10) PRIMARY KEY,
    productName VARCHAR(255),
    quantity INT,
    price DOUBLE,
    totalPrice DOUBLE
);

## Contributors
- Asrat Worku
- Eyuel Fiseha
- Ahmed Muhammed
- Abdulfetah Jemal
